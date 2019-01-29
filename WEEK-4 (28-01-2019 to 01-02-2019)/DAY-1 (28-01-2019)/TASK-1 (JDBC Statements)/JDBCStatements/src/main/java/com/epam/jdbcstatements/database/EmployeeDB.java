package com.epam.jdbcstatements.database;

import java.sql.Statement;
import java.util.List;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDB implements EmployeeDAO {
	private Connection connection;

	public EmployeeDB(Connection connection) {
		this.setConnection(connection);
	}

	@Override
	public ResultSet getEmployeeByID(int id) throws SQLException {
		Statement statement = connection.createStatement();
		statement.execute("select id,name from emp where id=" + String.valueOf(id));
		ResultSet resultSet = statement.getResultSet();
		return resultSet;
	}

	@Override
	public ResultSet getAllEmployees() throws SQLException {
		Statement statement = connection.createStatement();
		statement.execute("select id,name from emp");
		return statement.getResultSet();
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
