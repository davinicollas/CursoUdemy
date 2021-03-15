package db;

import java.sql.*;


public class DB {
    private static Connection conn = null;
    public static Connection getConnection() {
        if (conn == null) {
            try {
               String serverName= "localhost";
               String mydatabase = "coursejbc";
               String url="jdbc:mysql://"+ serverName +"/"+ mydatabase;
               String user= "root";
               String password= "12345";
               conn = DriverManager.getConnection(url, user,password);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }
    public static void CloseConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    public static void closeStament(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    public static void closeResult(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
