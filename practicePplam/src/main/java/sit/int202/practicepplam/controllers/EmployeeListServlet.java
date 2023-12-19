package sit.int202.practicepplam.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.practicepplam.entities.Employee;
import sit.int202.practicepplam.repositories.EmployeeRepository;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeListServlet", value = "/025/EmployeeListServlet")
public class EmployeeListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employeeList = employeeRepository.findAll();
        request.setAttribute("employees", employeeList);
        request.getRequestDispatcher("/025/EmployeeList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
