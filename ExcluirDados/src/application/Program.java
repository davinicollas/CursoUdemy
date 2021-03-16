package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET baseSalary = 2090 where departamentId = 1");
           /* int x = 1;
            if (x<2){
                throw new SQLException("fake Error");
            }*/
            int rows2 = st.executeUpdate("UPDATE seller SET baseSalary = 3090 where departamentId = 2");

            conn.commit();

            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);


        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back" + e.getMessage());
            } catch (SQLException throwables) {
                throw new DbException("error  try rolled back" + e.getMessage());
            }
        } finally {
            DB.closeStament(st);
            DB.CloseConnection();
        }


    }
}
