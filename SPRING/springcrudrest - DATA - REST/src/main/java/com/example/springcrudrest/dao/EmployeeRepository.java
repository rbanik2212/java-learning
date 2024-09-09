package com.example.springcrudrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.springcrudrest.entity.Employee;


//instead of using the exposed default of "/employees" for API it will use "/members"
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
