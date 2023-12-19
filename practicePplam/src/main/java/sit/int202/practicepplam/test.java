package sit.int202.practicepplam;

import sit.int202.practicepplam.entities.Employee;
import sit.int202.practicepplam.repositories.EmployeeRepository;

import java.sql.SQLOutput;
import java.util.List;

public class test {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> employeeList = employeeRepository.findAll();
        System.out.println(employeeList);
     }
}
