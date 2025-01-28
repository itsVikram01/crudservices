package com.crud.service;

import com.crud.dao.EmployeeDao;
import com.crud.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Employee saveEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    public List<Employee> findAllEmployee() {
        return employeeDao.findAllEmployee();
    }

    public Optional<Employee> findEmployeeById(Long id) {
        return employeeDao.findEmployeeById(id);
    }

    public Employee updateEmployee(Employee emp) {
        return employeeDao.updateEmployee(emp);
    }

    public void deleteEmployee(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }

    /*public List<Employee> getEmployeesInPaging(int pageNo, int pageSize) {
        return employeeDao.getEmployeesInPaging(pageNo, pageSize);
    }*/
    public Page<Employee> getAllEmployeesInPaging(Pageable pageable) {
        return employeeDao.getAllEmployeesInPaging(pageable);
    }
}
