package com.mongodb.learning.service;

import com.mongodb.learning.dto.EmployeeDTO;
import com.mongodb.learning.entity.Employee;
import com.mongodb.learning.exception.EmployeeNotFoundException;
import com.mongodb.learning.mapper.EmployeeMapper;
import com.mongodb.learning.repository.EmployeeRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    public String createEmployee(EmployeeDTO employeeDTO){
        Employee employee = EmployeeMapper.INSTANCE.toEntity(employeeDTO);
        Employee emp =employeeRepository.save(employee);
        return StringUtils.join(emp.getId(), " created");
    }


    public EmployeeDTO getEmployeeByID(String id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException("No employee found"));
        return EmployeeMapper.INSTANCE.toDto(employee);
        
    }
}
