package com.epam.jdbcstatements.database;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Class EmployeeDB.
 *
 * @author Somesh_Thakur
 */
public class EmployeeDB implements EmployeeDAO {

	/** The connection. */
	private Connection connection;

	/**
	 * Instantiates a new employee DB.
	 *
	 * @param connection the connection
	 */
	public EmployeeDB(Connection connection) {
		this.setConnection(connection);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.jdbcstatements.database.EmployeeDAO#getEmployeeByID(int)
	 */
	@Override
	public ResultSet getEmployeeByID(int id) throws SQLException {
		Statement statement = connection.createStatement();
		statement.execute("select id,name from emp where id=" + String.valueOf(id));
		ResultSet resultSet = statement.getResultSet();
		return resultSet;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.jdbcstatements.database.EmployeeDAO#getAllEmployees()
	 */
	@Override
	public ResultSet getAllEmployees() throws SQLException {
		Statement statement = connection.createStatement();
		statement.execute("select id,name from emp");
		return statement.getResultSet();
	}

	/**
	 * Sets the connection.
	 *
	 * @param connection the new connection
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
