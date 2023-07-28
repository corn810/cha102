package test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TestController() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		var xxx = req.getParameter("aaa");
		HttpSession session = req.getSession();
		session.setAttribute("nickname2", "corn2");
		req.setAttribute("nickname", "abc");
		req.getRequestDispatcher("/index.jsp").forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
}
