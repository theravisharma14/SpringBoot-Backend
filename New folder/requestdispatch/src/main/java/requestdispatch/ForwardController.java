package requestdispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForwardController")
public class ForwardController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name=request.getParameter("uname");

        System.out.println("Forward Controller Data received : "+ name);

        PrintWriter pw=  response.getWriter();
        pw.write("<b>Welcome to Forward Controller </b> <br>");

        RequestDispatcher dis=request.getRequestDispatcher("/SecondController");
        dis.forward(request, response);


    }

}