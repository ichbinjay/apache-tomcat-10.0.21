import java.io.*;
import jakarta.servlet.*;

public class Lifecycle implements Servlet{
    private ServletConfig sc;
    
    @Override
    public void init(ServletConfig config){
        sc = config;
        System.out.print("init()");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException{
        PrintWriter out = res.getWriter();
        out.println("hello from lifecycle servlet");
    }

    @Override
    public ServletConfig getServletConfig() {
        return sc;
    }

    @Override
    public String getServletInfo() {
        return "hai";
    }

    @Override
    public void destroy() {
        System.out.print("in destroy()");
    }
}