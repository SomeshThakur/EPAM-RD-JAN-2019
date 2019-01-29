package com.epam.jdbcstatements.database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Interface EmployeeDAO.
 *
 * @author Somesh_Thakur
 */
public interface EmployeeDAO {

	/**
	 * Gets the employee by ID.
	 *
	 * @param id the id
	 * @return the employee by ID
	 * @throws SQLException
	 */
	public ResultSet getEmployeeByID(int id) throws SQLException;

	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 */
	public ResultSet getAllEmployees() throws SQLException;
}
