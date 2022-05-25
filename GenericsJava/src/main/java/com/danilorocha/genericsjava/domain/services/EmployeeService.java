package com.danilorocha.genericsjava.domain.services;

import com.danilorocha.genericsjava.api.dto.EmployeeDTO;
import com.danilorocha.genericsjava.domain.entities.Employee;
import com.danilorocha.genericsjava.domain.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long> {

    private EmployeeRepository repo;

    @Override
    public JpaRepository<Employee, Long> getRepository() {
        return repo;
    }
}
