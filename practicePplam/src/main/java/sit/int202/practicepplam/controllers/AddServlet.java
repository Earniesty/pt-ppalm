package sit.int202.practicepplam.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.practicepplam.entities.Employee;
import sit.int202.practicepplam.repositories.EmployeeRepository;

import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/025/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String extension = request.getParameter("ext");
        String email = request.getParameter("email");
        String offcode = request.getParameter("offcode");
        Integer report = Integer.parseInt(request.getParameter("report"));
        String job = request.getParameter("job");

        Employee newEmployee = new Employee();
        newEmployee.setId(id);
        newEmployee.setFirstName(fname);
        newEmployee.setLastName(lname);
        newEmployee.setExtension(extension);
        newEmployee.setEmail(email);
        newEmployee.setOfficeCode(offcode);
        newEmployee.setReportsTo(report);
        newEmployee.setJobTitle(job);

        EmployeeRepository employeeRepository = new EmployeeRepository();
        request.setAttribute("message", employeeRepository.insert(newEmployee) ? "Added successfully!" : "Added fail.");
        request.getRequestDispatcher("/025/EmployeeAdd.jsp").forward(request, response);

//            boolean employeeInsert = employeeRepository.insert(newEmployee);
//            if (employeeInsert == false) {
//                request.setAttribute("error", "Invalid Input");
//                getServletContext().getRequestDispatcher("/025/EmployeeAdd.jsp").forward(request, response);
//            }
//            request.setAttribute("employees", employeeRepository.insert(newEmployee));
//
//        if (employeeRepository.insert(newEmployee)) {
//            System.out.println("success");
//            employeeRepository.close();
//        } else {
//            System.out.println("error employee");
//            request.setAttribute("errorAddingEmployee", "Employee code already exists.");
//            request.getRequestDispatcher("/025/EmployeeAdd.jsp").forward(request, response);
//        }
//
//        response.sendRedirect(request.getContextPath() + "/EmployeeAdd");

    }
}
