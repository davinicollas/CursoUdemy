package application;

import db.DB;

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
                    "UPDATE seller "
                        +"SET baseSalary = baseSalary + ? "
                        +"WHERE "
                        +"departamentId = ?");

            st.setDouble(1,200.0);
            st.setInt(2,2);

            int rowsAffect = st.executeUpdate();

            System.out.println("Done! Rows afect" + rowsAffect);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.closeStament(st);
            DB.CloseConnection();
        }


    }
}
