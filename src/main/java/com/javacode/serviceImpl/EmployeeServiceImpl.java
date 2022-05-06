package com.javacode.serviceImpl;

import com.javacode.entity.EmployeeEntity;
import com.javacode.repository.EmployeeRepository;
import com.javacode.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(EmployeeEntity entity) {
        employeeRepository.save(entity);
    }

    @Override
    public EmployeeEntity getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public void update(EmployeeEntity entity) {
        employeeRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
