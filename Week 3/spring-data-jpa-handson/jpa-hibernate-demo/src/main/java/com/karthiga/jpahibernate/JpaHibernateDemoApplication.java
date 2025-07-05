package com.karthiga.jpahibernate;

import com.karthiga.jpahibernate.model.*;
import com.karthiga.jpahibernate.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class JpaHibernateDemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaHibernateDemoApplication.class);

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(JpaHibernateDemoApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);

        testAddEmployee();
        testGetEmployee();
    }

    private static void testAddEmployee() throws Exception {
        LOGGER.info("Start - Add Employee");

        Employee employee = new Employee();
        employee.setName("Karthiga");
        employee.setSalary(50000);
        employee.setPermanent(true);
        employee.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse("2002-08-15"));

        Department dept = departmentService.get(1); // Ensure department with ID 1 exists
        employee.setDepartment(dept);

        employeeService.save(employee);

        LOGGER.debug("Saved Employee: {}", employee);
        LOGGER.info("End - Add Employee");
    }

    private static void testGetEmployee() {
        LOGGER.info("Start - Get Employee");
        Employee employee = employeeService.get(1);
        LOGGER.debug("Employee: {}", employee);
        LOGGER.debug("Department: {}", employee.getDepartment());
        LOGGER.info("End - Get Employee");
    }
}
