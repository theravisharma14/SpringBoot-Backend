package dynamicformgeneration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) {

				String url="jdbc:mysql://localhost:3306";
				String user="root";
				String pass="1234";
				try(Connection con= DriverManager.getConnection(url,user,pass);
						Statement stmt=con.createStatement();
						)
				{
					System.out.println("connection succes");
				}
				catch(SQLException e) {e.printStackTrace();}
				
			}

		}