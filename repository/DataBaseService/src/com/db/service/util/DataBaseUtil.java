package com.db.service.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.service.exception.DataBaseServiceException;
import com.db.service.handler.QueryHandlerInterface;
import com.db.service.handler.UpdateHandlerInterface;

public class DataBaseUtil {
	private Connection conn;
	public DataBaseUtil(Connection conn) {
		this.conn = conn;
	}
	public Object executeQuery(QueryHandlerInterface<?> handler, Object obj) throws DataBaseServiceException {
		try {
			PreparedStatement st = conn.prepareStatement(handler.getQuery());
			handler.prepareStatement(st, obj);
		} catch (SQLException e) {
			throw new DataBaseServiceException(e);
		} catch (Exception e) {
			throw new DataBaseServiceException(e);
		}
		return null;
	}
	public int[] executeUpdate(UpdateHandlerInterface handler, Object obj){
		return null;
	}
}
