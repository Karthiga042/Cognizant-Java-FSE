package com.karthiga.jpahibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.karthiga.jpahibernate.repository.EmployeeRepository;
import com.karthiga.jpahibernate.model.Employee;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee get(int id) {
        return employeeRepository.findById(id).get();
    }

    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
