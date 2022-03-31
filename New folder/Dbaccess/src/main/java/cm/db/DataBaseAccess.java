package cm.db;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataBaseAccess extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		String Driver=("com.mysql.cj.jdbc.Driver");
		String url=("jdbc:mysql://localhost:3306/");
		String user="root";
		String pass="1234";
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    String title = "Database Result";
	    String docType =
	            "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	         
	         out.println(docType +
	            "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	            "<h1 align = \"center\">" + title + "</h1>\n");
	
	      try {
	    	  Class.forName(Driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			  // Execute SQL query
	         Statement stmt = con.createStatement();
	         String sql;
	         sql = "SELECT id,name,address FROM employee";
	         ResultSet rs = stmt.executeQuery(sql);
	         
	         while(rs.next()){
	         	int id  = rs.getInt("id");
	            String name = rs.getString("name");
	            String address = rs.getString("address");

	         	out.println("ID: " + id + "<br>");
	            out.println(", Name: " + name + "<br>");
	            out.println(", Address: " + address + "<br>");
	         }
	         out.println("</body></html>");
	         rs.close();
	         stmt.close();
	         con.close();
	
		}catch(SQLException e) {e.printStackTrace();} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
