package dynamicformgeneration;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HeadersServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        Enumeration < String > e = request.getHeaderNames ();
        out.println ("<html>");
        out.println ("<body><center><br><br>");
        out.println ("<table border ='1' bgcolor='lightblue'>");
        out.println("<tr><td align='center'><h3>Header Names</h3></td><td align='center'><h3>Header Values</h3></td></tr>");
        while (e.hasMoreElements ())
        {
         String header_Name = (String) e.nextElement ();
         String header_Value = request.getHeader (header_Name);
         out.println ("<tr><td>" + header_Name + "</td><td>" + header_Value +"</td></tr>");
        }
        out.println ("</table></center></body></html>");
    }
}