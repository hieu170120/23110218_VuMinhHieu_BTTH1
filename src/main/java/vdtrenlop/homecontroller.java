package vdtrenlop;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "//", "/home", "/trangchu" })
public class homecontroller extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Hello");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
// Set response content type
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		// Nhận dữ liệu từ request URL
		String ten = request.getParameter("ten");
		String holot = request.getParameter("holot");
//Hiển thị dữ liệu ra web bằng đối tượng PrintWriter
		PrintWriter out = response.getWriter();
		out.println("<b>First Name</b>: " + ten + "<br/><b>Last Name</b>: " + holot);
	}
}
