package com.danilorocha.genericsjava.api.controllers;

import com.danilorocha.genericsjava.api.dto.EmployeeDTO;
import com.danilorocha.genericsjava.domain.entities.Employee;
import com.danilorocha.genericsjava.domain.services.EmployeeService;
import com.danilorocha.genericsjava.domain.services.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("employees")
public class EmployeeControler {

    private EmployeeService service;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
