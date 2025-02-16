package com.mongodb.learning.mapper;


import com.mongodb.learning.dto.EmployeeDTO;
import com.mongodb.learning.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDTO toDto(Employee employee);
    Employee toEntity(EmployeeDTO employeeDTO);

}
