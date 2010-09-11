package com.ivan.edms.core.data;

import java.sql.Connection;

public interface IDatabase {
	Connection getConnection();
}
