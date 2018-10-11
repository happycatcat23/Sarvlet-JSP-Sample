package filter;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"sample/forward"})
public class Forward extends HttpServlet{
	public void doget(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException {
		request.getRequestDispatcher("forward.jsp").forward(request, response);
	}

}
