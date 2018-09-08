package com.uhsnarp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private LoginService service = new LoginService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * PrintWriter out = response.getWriter(); out.println("<html>");
		 * out.println("<head>"); out.println("<title>Yahoo!!!!!!!!</title>");
		 * out.println("</head>"); out.println("<body>");
		 * out.println("My First Servlet"); out.println("</body>");
		 * out.println("</html>");
		 */
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		request.setAttribute("name", request.getParameter("password"));

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		String password = request.getParameter("password");
		boolean userValid = service.isUserValid(name, password);
		if (userValid) {
			request.setAttribute("password", password);
			request.setAttribute("name", name);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Invalid credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}
