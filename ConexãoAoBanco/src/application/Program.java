package application;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from departament");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeResult(rs);
            DB.closeStament(st);
            DB.CloseConnection();
        }
    }
}
