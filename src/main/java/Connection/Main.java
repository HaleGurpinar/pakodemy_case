package Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    // connect postgres

    public static void main(String[] args) throws SQLException {

        ConnectionUtil db = new ConnectionUtil();
        db.connect_to_db("postgres","postgres","zxc");


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

