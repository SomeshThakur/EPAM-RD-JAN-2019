package com.epam.jdbcstatements.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.epam.jdbcstatements.database.EmployeeDB;
import com.epam.jdbcstatements.util.DBConnection;

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
		try (Connection connection = DBConnection.getInstance()) {

			EmployeeDB db = new EmployeeDB(connection);
			ResultSet resultSet = db.getAllEmployees();
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

	}
}
