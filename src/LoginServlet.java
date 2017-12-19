

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		LoginModel lm = new LoginModel();
		boolean result = lm.authenticate(user, pwd);
		
		if(result) {
			response.sendRedirect("success.jsp");
			return;
		}
		response.sendRedirect("login.jsp");
		return;
	}

}
