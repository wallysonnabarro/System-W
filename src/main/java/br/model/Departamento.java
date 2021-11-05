package br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.dto.DepartamentoDto;

@Entity
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departamento;
	private String telefone;

	public Departamento() {
	}

	public Departamento(DepartamentoDto dto) {
		this.departamento = dto.getDepartamento();
		this.telefone = dto.getTelefone();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getTelefone() {
		return telefone;
	}
}
