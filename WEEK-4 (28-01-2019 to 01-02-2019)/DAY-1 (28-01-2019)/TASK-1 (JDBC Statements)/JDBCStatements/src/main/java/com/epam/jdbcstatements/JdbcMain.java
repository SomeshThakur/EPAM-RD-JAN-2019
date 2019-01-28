package com.epam.jdbcstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The Class JdbcMain.
 *
 * @author Somesh_Thakur
 */
public class JdbcMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			loadDriverClass();

			try (Connection con = createConnection()) {
				Statement statement = con.createStatement();
				statement.execute("select id,name from emp");
				ResultSet resultSet = statement.getResultSet();
				System.out.println("Going Forward..");
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
				}
				System.out.println("Going Backward..");
				while (resultSet.previous()) {
					System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates the connection.
	 *
	 * @return the connection
	 * @throws SQLException the SQL exception
	 */
	private static Connection createConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/rddb", "root", "Epam123$$");
	}

	/**
	 * Load driver class.
	 *
	 * @throws InstantiationException the instantiation exception
	 * @throws IllegalAccessException the illegal access exception
	 * @throws ClassNotFoundException the class not found exception
	 */
	private static void loadDriverClass()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
}
