import java.sql.*;

class StudentDAO {

    public void insertStudent(int id, String name) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root", "password");

        PreparedStatement ps =
                con.prepareStatement(
                        "INSERT INTO students VALUES (?,?)");

        ps.setInt(1, id);
        ps.setString(2, name);

        ps.executeUpdate();
        con.close();
    }

    public void updateStudent(int id, String name) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root", "password");

        PreparedStatement ps =
                con.prepareStatement(
                        "UPDATE students SET name=? WHERE id=?");

        ps.setString(1, name);
        ps.setInt(2, id);

        ps.executeUpdate();
        con.close();
    }
}