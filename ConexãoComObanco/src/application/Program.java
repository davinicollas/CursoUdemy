package application;

import db.DB;

import java.sql.Connection;
import java.sql.SQLOutput;

public class Program {

    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.CloseConnection();
    }
}
