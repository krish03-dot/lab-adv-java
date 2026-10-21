import java.sql.*;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/clg";
        String user = "root";
        String password = "Noddy@123";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection created: " + con);

            String insertSql = "INSERT INTO student VALUES (?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(insertSql)) {
                ps.setInt(1, 104);
                ps.setString(2, "bhavesh");
                ps.setString(3, "CSE");
                ps.executeUpdate();
                System.out.println("Record Inserted");
            }

            try (Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM student")) {
                System.out.println("--- Student Records ---");
                while (rs.next()) {
                    System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3)
                    );
                }
            }

            System.out.println("All operations completed and resources closed.");
        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
