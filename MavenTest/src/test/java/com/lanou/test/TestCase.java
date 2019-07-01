package com.lanou.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class TestCase {
	@Test
	public void test1() throws SQLException {
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/lanou1811", 
				"root", 
				"1234");
		System.out.println("conn="+conn);
	}
}
