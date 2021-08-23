package com.example.springbatch.mapper;

import com.example.springbatch.dto.EmployeeDTO;
import com.example.springbatch.model.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeFileRowMapperEx {
    @Mapping(source = "EMPLOYEE_DTO", target = "employee")
    EmployeeDTO EMPLOYEE_DTO(Employee employee);
    @InheritInverseConfiguration
    Employee employee(EmployeeDTO EMPLOYEE_DTO);
}
