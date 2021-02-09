package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;

@Repository
@Transactional
public interface EmployeeDAO extends CrudRepository<Employee,Integer> {

    List<Employee> findAll();                           // fetch all Employee
}
