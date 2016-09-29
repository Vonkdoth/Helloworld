import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Sample extends HttpServlet{ 
  public void doGet(HttpServletRequest request, 
  HttpServletResponse response)
  throws ServletException,IOException{
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  pw.println("<html>");
  pw.println("<head><title>Welcome to the World</title></title>");
  pw.println("<body>");
  pw.println("<h1>welcome to the world</h1>");
  pw.println("</body></html>");
  }
}
