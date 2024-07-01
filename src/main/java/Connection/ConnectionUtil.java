package Connection;

import java.sql.*;

public class ConnectionUtil {

    public Connection connect_to_db(String dbname, String user, String pass) {

        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Connection Established");
            } else {
                System.out.println("Connection Failed");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

//    public void createTable(Connection conn) {
//
//        Statement statement;
//        try {
//            String query = "create table " +  "(id SERIAL PRIMARY KEY NOT NULL, balance numeric(10, 2) default 0, social_security int4 NOT NULL UNIQUE);";
//            statement = conn.createStatement();
//            statement.executeUpdate(query);
//            System.out.println("please enter your social security number");
//
//        } catch (Exception e) {
//            System.out.println("entering db information");
//
//        }
//    }

}
