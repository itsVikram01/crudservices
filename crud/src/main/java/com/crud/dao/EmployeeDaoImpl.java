package com.crud.dao;

import com.crud.model.Employee;
import com.crud.repository.EmployeeRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    private final EmployeeRepo employeeRepo;

    public EmployeeDaoImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> findEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return employeeRepo.save(emp);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepo.delete(employee);
    }

    /*@Override
    public List<Employee> getEmployeesInPaging(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        Page<Employee> employeePage = employeeRepo.findAll(pageable);
        return employeePage.getContent();
    }*/
    @Override
    public Page<Employee> getAllEmployeesInPaging(Pageable pageable) {
        return employeeRepo.findAll(pageable);
    }

}
