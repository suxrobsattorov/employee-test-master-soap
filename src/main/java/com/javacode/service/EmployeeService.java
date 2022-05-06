package com.javacode.service;

import com.javacode.entity.EmployeeEntity;

public interface EmployeeService {

    void addEmployee(EmployeeEntity dto);

    EmployeeEntity getEmployeeById(Long employeeId);

    void update(EmployeeEntity dto);

    void delete(Long id);
}
