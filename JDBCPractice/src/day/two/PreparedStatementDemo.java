package day.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PreparedStatementDemo {
	public void addElement() {
		Connection connection = null;
		String query = null;
		PreparedStatement preparedStatement = null;
		int id = 106;
		String product = "Coffee Machine";
		double price = 4000;
		
		System.out.println("Adding element");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "");

			query = "insert into product values (?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, product);
			preparedStatement.setDouble(3, price);

			int i = preparedStatement.executeUpdate();

			System.out.println(i);

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

	
	public void getData() {
		Connection connection = null;
		String query = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ResultSetMetaData resultSetMetaData = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "");

			query = "select * from product";
			preparedStatement = connection.prepareStatement(query);

			resultSet= preparedStatement.executeQuery();
			
			resultSetMetaData = resultSet.getMetaData();

			System.out.println(resultSetMetaData.getColumnName(1));

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

	public static void main(String[] args) {
		PreparedStatementDemo preparedStatementDemo = new PreparedStatementDemo();
		
//		preparedStatementDemo.addElement();
		
		preparedStatementDemo.getData();
	}
}
