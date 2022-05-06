package com.javacode.application;

import com.javacode.entity.EmployeeEntity;
import com.javacode.interfaces.*;
import com.javacode.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndpoint {

    private static final String NAMESPACE_URI = "http://interfaces.javacode.com";

    @Autowired
    private EmployeeService employeeService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addEmployeeRequest")
    @ResponsePayload
    public AddEmployeeResponse addEmployee(@RequestPayload AddEmployeeRequest request) {
        AddEmployeeResponse response = new AddEmployeeResponse();
        ServiceStatus serviceStatus = new ServiceStatus();

        EmployeeEntity employee = new EmployeeEntity();
        employee.setId(request.getEmployeeInfo().getId());
        employee.setName(request.getEmployeeInfo().getName());
        employee.setDepartment(request.getEmployeeInfo().getDepartment());
        employee.setAddress(request.getEmployeeInfo().getAddress());
        employee.setPhone(request.getEmployeeInfo().getPhone());
        BeanUtils.copyProperties(request.getEmployeeInfo(), employee);
        employeeService.addEmployee(employee);
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Added Successfully");
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeByIdRequest")
    @ResponsePayload
    public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeByIdRequest request) {
        GetEmployeeResponse response = new GetEmployeeResponse();
        EmployeeInfo employeeInfo = new EmployeeInfo();
        BeanUtils.copyProperties(employeeService.getEmployeeById(request.getId()), employeeInfo);
        response.setEmployeeInfo(employeeInfo);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateEmployeeRequest")
    @ResponsePayload
    public UpdateEmployeeResponse updateEmployee(@RequestPayload UpdateEmployeeRequest request) {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setId(request.getEmployeeInfo().getId());
        employee.setName(request.getEmployeeInfo().getName());
        employee.setDepartment(request.getEmployeeInfo().getDepartment());
        employee.setAddress(request.getEmployeeInfo().getAddress());
        employee.setPhone(request.getEmployeeInfo().getPhone());
        BeanUtils.copyProperties(request.getEmployeeInfo(), employee);
        employeeService.update(employee);
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Updated Successfully");
        UpdateEmployeeResponse response = new UpdateEmployeeResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteEmployeeRequest")
    @ResponsePayload
    public DeleteEmployeeResponse deleteEmployee(@RequestPayload DeleteEmployeeRequest request) {
        employeeService.delete(request.getId());
        ServiceStatus serviceStatus = new ServiceStatus();

        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Deleted Successfully");
        DeleteEmployeeResponse response = new DeleteEmployeeResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

}
