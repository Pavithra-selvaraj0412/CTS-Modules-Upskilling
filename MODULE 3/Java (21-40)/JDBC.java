import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " +
                    rs.getString("name"));
        }

        con.close();
    }
}