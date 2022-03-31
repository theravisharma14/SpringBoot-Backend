package requestdispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondController
 */
@WebServlet("/SecondController")
public class SecondController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=request.getParameter("uname");

        System.out.println("Second Controller Data received : "+ name);

        PrintWriter pw=  response.getWriter();
        pw.write("<b>Welcome to Second Controller </b> <br>");


    }

}