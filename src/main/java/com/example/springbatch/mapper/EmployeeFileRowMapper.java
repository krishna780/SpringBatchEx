package com.example.springbatch.mapper;

import com.example.springbatch.dto.EmployeeDTO;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class EmployeeFileRowMapper implements FieldSetMapper<EmployeeDTO> {
    @Override
    public EmployeeDTO mapFieldSet(FieldSet fieldSet) throws BindException {
        EmployeeDTO employeeDTO= new EmployeeDTO();
        employeeDTO.setEmployeeId(fieldSet.readString("employeeId"));
        employeeDTO.setFirstName(fieldSet.readString("firstName"));
        employeeDTO.setLastName(fieldSet.readString("lastName"));
        employeeDTO.setEmail(fieldSet.readString("email"));
        employeeDTO.setAge(fieldSet.readInt("age"));
        return employeeDTO;
    }
}
