import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>" +
                "First Line<br>" +
                "Second Line<br>" +
                "Third Line<br>" +
                "Fourth Line<br>" +
<<<<<<< HEAD
                "Mid Line 255<br>" +
                "My Line<br>" +
=======
                "My Lineeeeeeeeeeeeee<br>" +
>>>>>>> 570eaf20c85c1f7c1798f69c3a80d9d4ec39c4e1
                "Fifth line<br>");
        writer.println("</html>");
    }


}
