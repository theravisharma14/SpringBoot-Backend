/*import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import Project.ConnectionProvider;
import javax.servlet.http.*;


@WebServlet("/login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		    	
		if(LoginDao.validate(name, password)){
			RequestDispatcher rd =request.getRequestDispatcher("servlet2");
			rd.forward(request,response);
			//response.sendRedirect("Welcome.java");
			//request.setAttribute("status", "You are successfully registered...");
	    	//dis.forward(request, response);
	    	
		}else{
			out.print("Sorry userName or Password error..!!!");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request,response);
			//response.sendRedirect("login.html");
		}
		
		out.close();
	   	
	}

}*/

import java.io.*;
import java.sql.*;
import Project.ConnectionProvider;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	response.setContentType("text.html");
    	PrintWriter out = response.getWriter();
    	
        String name = request.getParameter("name");
        String password = request.getParameter("password");

// Connect to mysql(mariadb) and verify username password

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");  
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb","root","1234");
    		//Connection con = ConnectionProvider.getCon();
    		
            PreparedStatement ps = con.prepareStatement("select name,password from users where name=? and password=?");
            ps.setString(1, name);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	out.print("<a href='index.html'>Logout</a>");
            	out.print("<h2>Your name is : "+name+"</h2>");
        		
                return;
            }
           // out.print("UserName or Password invalid...!!");
           	request.getRequestDispatcher("login.html").include(request, response);
           	out.print("UserName or Password invalid...!!");
      
            //response.sendRedirect("login.html");
            return;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
