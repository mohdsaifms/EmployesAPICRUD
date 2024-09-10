package com.New_Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.New_Project.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
