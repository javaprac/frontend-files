package com.db.service.handler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface QueryHandlerInterface<T> {
	public String getQuery();
	public T mapRow(ResultSet rs);
	public void prepareStatement(PreparedStatement st, Object obj);
}
