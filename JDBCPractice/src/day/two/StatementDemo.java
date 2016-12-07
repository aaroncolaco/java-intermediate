package day.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		Connection connection = null;
		String query = null;
		Statement statement;
		ResultSet resultSet;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "");
			
			query = "select * from product";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			
			while (resultSet.next()) {
				System.out.printf("%d - %s - %.2f\n", resultSet.getInt("id"), resultSet.getString(2), resultSet.getDouble(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
