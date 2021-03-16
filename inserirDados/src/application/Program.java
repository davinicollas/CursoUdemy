package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try{
        conn = DB.getConnection();
        /* exewmplo 1
            st = conn.prepareStatement(
                "Insert into seller "
                + "(nome,email,birthDate,baseSalary,departamentId)"
                + "values"
                + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            st.setString(1, "Carl Purple");
            st.setString(2, "Carl@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("25/05/2015").getTime()));
            st.setDouble(4, 1500.00);
            st.setDouble(5, 4);
            */

            /*Exemplo 2*/
            st = conn.prepareStatement(
                        "INSERT INTO departament (nome) VALUES ('D1'),('D2')",
                    Statement.RETURN_GENERATED_KEYS);
            int rowsAfecrs = st.executeUpdate();

            if(rowsAfecrs>0){
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! id= " +id );
                }
            }else{
                System.out.println("No rown affected! ");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }/*catch (ParseException e){
            e.printStackTrace();
        }*/
        finally {
            DB.closeStament(st);
            DB.CloseConnection();
        }
        }
}
