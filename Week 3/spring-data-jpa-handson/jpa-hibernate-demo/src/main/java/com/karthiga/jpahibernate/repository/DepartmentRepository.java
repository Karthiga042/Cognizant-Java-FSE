package com.karthiga.jpahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.karthiga.jpahibernate.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
