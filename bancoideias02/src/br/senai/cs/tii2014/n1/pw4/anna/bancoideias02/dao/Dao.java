package br.senai.cs.tii2014.n1.pw4.anna.bancoideias02.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class Dao {

	private static Connection conn;
	
	protected Connection getConnection(){
		if (conn == null){
			try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=");
			System.out.println("Conectou.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

}
