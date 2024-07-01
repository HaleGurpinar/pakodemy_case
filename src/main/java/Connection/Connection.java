package Connection;
import java.sql.*;
public class Connection {

    public static void main(String[] args) {

        var sql = "CREATE TABLE products (" +
                "    id SERIAL PRIMARY KEY," +
                "    name VARCHAR(255) NOT NULL," +
                "    image VARCHAR(255) NOT NULL" +
                ");";
        try (var conn =  DB.connect();
             var stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
