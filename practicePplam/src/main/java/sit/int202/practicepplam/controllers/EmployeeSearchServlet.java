package sit.int202.practicepplam.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.practicepplam.entities.Employee;
import sit.int202.practicepplam.repositories.EmployeeRepository;


import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeSearchServlet", value = "/025/EmployeeSearchServlet")
public class EmployeeSearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
//        String name = request.getParameter("searchField");
//        EmployeeRepository employeeSearch = new EmployeeRepository();
//        List<Employee> employeeList = employeeSearch.findByName(name);
//        request.setAttribute("employees", employeeList);
//        String msg;
//        if (employeeList.isEmpty()) {
//            msg = "Not Found";
//        } else {
//            msg = "Search Successfully!";
//        }
//        httpSession.setAttribute("errMsg", msg);
//        request.setAttribute("message", msg);
//        request.setAttribute("employees", employeeList);
//
//        request.getRequestDispatcher("/EmployeeList.jsp").forward(request, response);

            String inputField = request.getParameter("searchField");
            EmployeeRepository employeeRepository = new EmployeeRepository();
            List<Employee> employeeList = employeeRepository.findByName(inputField);
            String msg;
            msg = employeeList.isEmpty() ? "Not Found" : "Search Successfully!";
            request.setAttribute("message", msg);
            request.setAttribute("employees", employeeList);
            request.getRequestDispatcher("/025/EmployeeList.jsp").forward(request, response);
    }
}
