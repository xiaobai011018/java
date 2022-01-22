import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
class User{
    public String name;
    public int count;
}
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");
        if (!"123".equals(userId)||!"bsc".equals(password)){
            resp.sendRedirect("login.html");
        }
        HttpSession session = req.getSession(true);
        session.setAttribute("name","张三");
        session.setAttribute("count",0);
        resp.sendRedirect("success");
    }
}
