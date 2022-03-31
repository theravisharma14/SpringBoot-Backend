package com.logindb;
import java.sql.*;
import com.login.login;
import com.dbconnection.DBConnection;
public class LoginDB {
	
	public boolean vaildate(login bean) throws ClassNotFoundException, SQLException
	{
		boolean status=false;
		Connection connection=DBConnection.getConn();
	    try {
	      PreparedStatement ps=connection.prepareStatement("select * from user_register where userName=? and password=?");
	      ps.setString(1, bean.getUserName());
	      ps.setString(2, bean.getPassword());
	      ResultSet rs=ps.executeQuery();
	      status=rs.next();
	    } catch (SQLException e) 
	    {
	      e.printStackTrace();
	    }    

		return status;}
}
