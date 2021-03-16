package application;

import db.DB;
import db.DbintegratyExecption;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "DELETE FROM departament "
                            + "where " +
                            "id = ?"
            );

            st.setInt(1, 2);
            int rowsAffect = st.executeUpdate();

            System.out.println("Done! Rows afect" + rowsAffect);

        } catch (SQLException e) {
            throw new DbintegratyExecption(e.getMessage());
        } finally {
            DB.closeStament(st);
            DB.CloseConnection();
        }


    }
}
