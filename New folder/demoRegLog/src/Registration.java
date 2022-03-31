

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
//import Project.ConnectionProvider;
import javax.servlet.http.*;

@WebServlet("/index")
public class Registration extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
              
    String name=request.getParameter("name");  
    String password=request.getParameter("password");  
    String contact=request.getParameter("contact");  
    String country=request.getParameter("country");  
              
    try{  
    	Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegedb","root","1234");
		//Connection con = ConnectionProvider.getCon();
    PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?)");  
      
    ps.setString(1,name);  
    ps.setString(2,password);  
    ps.setString(3,contact);  
    ps.setString(4,country);  
              
    int i=ps.executeUpdate();  
    response.sendRedirect("index.html");
    if(i>0)
    {
    	
    request.setAttribute("status", "success");
    //dis.forward(request, response);
    }
    else
    {
    request.setAttribute("status", "failed");
    }        
    }catch (Exception e2) {System.out.println(e2);}  
              
    out.close();  
    }  
    
}
