package exception;

import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            loadDriver();
            connectDB();
            parseDate();
            readFile(); // IO Exception
                //Class not Found Exception
                 // ParseException
                 // SQL Exception

            } catch (IOException |ClassNotFoundException| ParseException| SQLException e){
                System.out.println("Exception caught : " + e);
            }
         finally {
            System.out.println("Finally block is always executed");
        }}


    public static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }
    static void loadDriver() throws ClassNotFoundException {
            Class.forName("com.mysql.jdbc.Driver");
    }
    static void parseDate() throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-YYYY");
        sd.parse("2025/01/07");
    }
    static void connectDB() throws SQLException {
        DriverManager.getConnection("jdbc:mysql://localhost:3306/db","user", "pass");
    }
 }



