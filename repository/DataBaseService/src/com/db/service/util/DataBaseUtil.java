package com.db.service.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.service.exception.DataBaseServiceException;
import com.db.service.handler.QueryHandlerInterface;
import com.db.service.handler.UpdateHandlerInterface;

public class DataBaseUtil {
	private Connection conn;
	public DataBaseUtil(Connection conn) {
		this.conn = conn;
	}
	@SuppressWarnings("rawtypes")
	public Object executeQuery(QueryHandlerInterface handler, Object obj) throws DataBaseServiceException {
		Object queryReturn = null;
		try {
			PreparedStatement st = conn.prepareStatement(handler.getQuery());
			handler.prepareStatement(st, obj);
			ResultSet rs = st.executeQuery();
			queryReturn = handler.mapRow(rs);
		} catch (SQLException e) {
			throw new DataBaseServiceException(e);
		} catch (Exception e) {
			throw new DataBaseServiceException(e);
		}
		return queryReturn;
	}
	public int[] executeUpdate(UpdateHandlerInterface handler, Object obj) throws DataBaseServiceException {
		return null;
	}
}
