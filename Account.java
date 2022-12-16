import java.sql.*;
import java.util.Scanner;

public class Account {
    public static void main(String... args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/infinite";
        String user = "root";
        String password = "Rootadmin@123";
        Connection com = DriverManager.getConnection(url, user, password);
        Statement stmt = com.createStatement();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account no you want to search:");
            Long acnt_number = sc.nextLong();
            System.out.println("enter month");
            int m = sc.nextInt();
            String str = "{call get_credit(?,?,?)}";
            CallableStatement cs = com.prepareCall(str);
            cs.setDouble(1,acnt_number);
            cs.setInt(2, m);
            cs.registerOutParameter(3, Types.DOUBLE);
            cs.execute();

            double tran_bal = cs.getDouble(3);
            tran_bal = tran_bal - tran_bal/100* 5;

            System.out.println("tran_bal: " + tran_bal);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}