package Connection;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    // connect postgres

    public static void main(String[] args) {
        ConnectionUtil db = new ConnectionUtil();
        db.connect_to_db("postgres","postgres","");
    }
}
