import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcConnect {

	public static void main(String[] args) {
		Connection connection = null;
		String query = null;
		Statement statement;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 1. Load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. Establish connections
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "");
			System.out.println("Connected");
			
			System.out.print("Enter product: ");
			String product = bufferedReader.readLine().trim();
			System.out.print("Enter id: ");
			int id = Integer.parseInt( bufferedReader.readLine().trim());
			System.out.print("Enter price: ");
			double price = Double.parseDouble(bufferedReader.readLine().trim());
			
//			query = "insert into product values(" + id + ",'" + product + "',"  + price + ")";
			query = "update product set name='" + product + "' where id=101";
			statement = connection.createStatement();
			int i = statement.executeUpdate(query);
			
			if (i>0) {
				System.out.println("Record inserted");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
