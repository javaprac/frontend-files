package com.db.service.handler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface QueryHandlerInterface<T> {
	/**
	 * Returns the query to be executed
	 * @return
	 */
	public String getQuery();
	/**
	 * Maps the resultset row to the object
	 * @param rs
	 * @return
	 */
	public T mapRow(ResultSet rs);
	
	/**
	 * Prepares the statement on which the query is to be fired.
	 * @param st
	 * @param obj
	 */
	public void prepareStatement(PreparedStatement st, Object obj);
}
