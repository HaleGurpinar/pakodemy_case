package Connection;

import java.sql.*;

import java.util.Scanner;

public class CreateTable {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) throws SQLException {

        ConnectionUtil db = new ConnectionUtil();
        db.connect_to_db("postgres","postgres","zxc");
        // connect postgres

        //Connection c=null;

//        Statement stmt = null;
//
//        String CreateSql = null;
//
//        stmt = db.createStatement();
//
//        CreateSql = "Create Table Test(id int primary key,name varchar, address text) ";
//
//        stmt.executeUpdate(CreateSql);
//
//        stmt.close();
//
//        c.close();

        Statement sql_statement =   db.createTable();
        String createNewTable = "CREATE TABLE recipe_table ("
                + "rec_id serial PRIMARY KEY,"
                + "rec_name TEXT,"
                + "rec_localizedName TEXT,"
                + "rec_image VARCHAR(255))";
        sql_statement.execute(createNewTable);
        System.out.println("Table Created!");
        }
    }

