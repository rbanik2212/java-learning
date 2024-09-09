package com.example.springcrudrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springcrudrest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
