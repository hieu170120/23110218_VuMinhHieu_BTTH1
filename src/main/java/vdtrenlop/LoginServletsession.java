package vdtrenlop;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/loginsession"})
public class LoginServletsession extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // lấy dữ liệu từ form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("trungnh".equals(username) && "123".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("name", username);

            // điều hướng tới home.html
            response.sendRedirect("Hometest.html");
        } else {
            out.print("Tài khoản hoặc mật khẩu không chính xác");
            request.getRequestDispatcher("Login-session.html").include(request, response);
        }
    }
}
