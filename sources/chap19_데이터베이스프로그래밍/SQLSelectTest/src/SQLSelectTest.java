import java.sql.*;
 
public class SQLSelectTest {
    public static Connection makeConnection()
    {
		String url = "jdbc:mysql://localhost/book_db";	// book_db�� �����Ǿ� �־�� �Ѵ�!
		String id = "root";
		String password = "password";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}
		return con;
    }
    public static void main(String arg[]) throws SQLException {
        Connection con = makeConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM books");
        while (rs.next()) {
               int id = rs.getInt("book_id");
               String title = rs.getString("title");
               System.out.println(id + " " + title);
        }
    }
}