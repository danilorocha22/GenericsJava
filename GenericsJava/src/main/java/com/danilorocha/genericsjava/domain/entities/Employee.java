package com.danilorocha.genericsjava.domain.entities;

import com.danilorocha.genericsjava.api.dto.EmployeeDTO;
import com.danilorocha.genericsjava.domain.util.Convertible;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "tb_employee")
public class Employee implements Convertible<EmployeeDTO> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	public Employee() {}

	@Override
	public EmployeeDTO convert() {
		return new EmployeeDTO(this);
	}
}


