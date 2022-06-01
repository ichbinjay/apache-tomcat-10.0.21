import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class httpreq extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException{
        PrintWriter out = res.getWriter();
        out.print("hello");
        
    }
}