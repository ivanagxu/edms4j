package com.ivan.edms.test.data;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.ivan.edms.core.data.Database;
import com.ivan.edms.core.data.IDatabase;

public class DatabaseTest extends TestCase {
	public void testGetConnection()
	{
		IDatabase target = new Database();
		Assert.assertNull(target.getConnection());
	}
}
