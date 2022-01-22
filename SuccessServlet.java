import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session==null){
            return;

        }
        resp.setContentType("text/html; charset=utf-8");
        Integer count = (Integer)session.getAttribute("count");
        count++;
        session.setAttribute("count",count);
        resp.getWriter().write(session.getAttribute("name")+"<br>"+session.getAttribute("count"));
    }
}
