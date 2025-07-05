package com.karthiga.jpahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.karthiga.jpahibernate.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
