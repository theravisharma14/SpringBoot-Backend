package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	
	public static Connection getConn() throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/registration_form";
		String user="root";
		String pass="1234";
		Connection con=null;
		try{
			con=DriverManager.getConnection(url,user,pass);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		//con.close();
		}
		return con;
		
	}

}
