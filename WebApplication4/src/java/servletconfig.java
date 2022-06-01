import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
public class servletconfig extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws
ServletException,IOException
{ res.setContentType("text/html");
PrintWriter out=res.getWriter();
//creating ServletContext object
ServletConfig config=getServletConfig();
//Getting the value of the initialization parameter and printing it
String name=config.getInitParameter("name");
String dept=config.getInitParameter("dept");
out.println("name is=" +name);
out.println("dept is="+ dept);
out.close();
}
}