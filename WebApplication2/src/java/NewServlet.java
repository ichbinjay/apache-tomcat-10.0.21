import java.io.*;
import jakarta.servlet.*;

public class NewServlet extends GenericServlet{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException{
        int a = Integer.parseInt(req.getParameter("value1"));
        int b = Integer.parseInt(req.getParameter("value2"));
        int c = a+b;
        PrintWriter out = res.getWriter();
        out.println("sum is "+c);
    }
}
