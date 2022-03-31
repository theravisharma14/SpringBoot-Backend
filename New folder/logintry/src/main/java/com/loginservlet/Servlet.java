package com.loginservlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.login;
import com.logindb.LoginDB;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	      String uname=request.getParameter("uname");
	      String pass=request.getParameter("pass");
	      login bean=new login(pass, pass);
	      LoginDB dao=new LoginDB();
	      bean.setUserName(uname);
	      bean.setPassword(pass);
	      try {
			if(dao.vaildate(bean))
			  {
			    response.sendRedirect("Welcome.html");
			  }
			  else
			  {
			    response.sendRedirect("login.html");
			  }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
