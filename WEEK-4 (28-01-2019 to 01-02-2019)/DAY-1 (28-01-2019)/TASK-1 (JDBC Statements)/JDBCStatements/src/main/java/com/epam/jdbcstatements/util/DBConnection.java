package com.epam.jdbcstatements.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The Class DBConnection.
 *
 * @author Somesh_Thakur
 */
public class DBConnection {

	/** The connection. */
	private static Connection connection;

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
	 * Gets the single instance of DBConnection.
	 *
	 * @return single instance of DBConnection
	 * @throws SQLException the SQL exception
	 */
	public static Connection getInstance() throws SQLException {
		return connection == null ? createConnection() : connection;
	}

}
