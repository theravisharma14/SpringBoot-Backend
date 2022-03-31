import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletDatabaseDemo extends HttpServlet  
{
      protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
      {
           PrintWriter pw = res.getWriter();
           res.setContentType("text/html");        
           String tableName = req.getParameter("table");
           try
           {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee");
               Statement st=con.createStatement();
               System.out.println ("connection established successfully...!!");     
               ResultSet rs = st.executeQuery("Select * from "+tableName);
               pw.println("<table border=1>");
               while(rs.next())
               {
                     pw.println("<tr><td>"+rs.getInt("id")+"</td>  <td>"+rs.getString("name")+"</td><td>"+rs.getString("address")+"</td> </tr>");
               }
               pw.println("</table>");
               pw.close();
               rs.close();
               con.close();
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
      }
}
