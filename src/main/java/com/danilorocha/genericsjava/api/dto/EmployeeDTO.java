package com.danilorocha.genericsjava.api.dto;

import com.danilorocha.genericsjava.domain.entities.Employee;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;
    private String name;

    public EmployeeDTO(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
    }

}
