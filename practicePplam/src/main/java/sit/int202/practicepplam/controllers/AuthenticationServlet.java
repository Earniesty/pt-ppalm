package sit.int202.practicepplam.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AuthenticationServlet", value = "/025/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("enter servlet");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("Earniesty") && password.equals("025")) {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            request.setAttribute("message", "Login Success, enjoy");
        } else {
            request.setAttribute("message", "invalid input");
        }
        request.getRequestDispatcher("/025/index.jsp").forward(request, response);
    }

}
