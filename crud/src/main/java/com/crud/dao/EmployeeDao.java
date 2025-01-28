package com.crud.dao;

import com.crud.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    Employee saveEmployee(Employee employee);

    List<Employee> findAllEmployee();

    Optional<Employee> findEmployeeById(Long id);

    Employee updateEmployee(Employee emp);

    void deleteEmployee(Employee employee);

    //List<Employee> getEmployeesInPaging(int pageNo, int pageSize);
    Page<Employee> getAllEmployeesInPaging(Pageable pageable);

}
