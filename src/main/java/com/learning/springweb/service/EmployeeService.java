package com.learning.springweb.service;

import com.learning.springweb.model.Employee;
import com.learning.springweb.model.EmployeePage;
import com.learning.springweb.model.EmployeeSearchCriteria;
import com.learning.springweb.repository.EmployeeCriteriaRepository;
import com.learning.springweb.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService{

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository){
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage,
                                       EmployeeSearchCriteria employeeSearchCriteria){
        return employeeCriteriaRepository.findAllWithFilters(employeePage,employeeSearchCriteria);

    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
