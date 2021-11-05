package br.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.model.Departamento;

public class DepartamentoDto {
	private Long id;
	private String departamento;
	private String telefone;

	public DepartamentoDto() {
	}

	public DepartamentoDto(Departamento departamento) {
		this.id = departamento.getId();
		this.departamento = departamento.getDepartamento();
		this.telefone = departamento.getTelefone();
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
	
	public List<DepartamentoDto> convert(List<Departamento> departamentos) {
		return departamentos.stream().map(DepartamentoDto::new).collect(Collectors.toList());
	}
}
