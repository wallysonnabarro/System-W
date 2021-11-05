package br.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.model.Cargo;

public class CargoDto {
	private Long id;
	private String cargo;

	public CargoDto() {
	}
	
	public CargoDto(Cargo cargo) {
		this.cargo = cargo.getCargo();
		this.id = cargo.getId();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<CargoDto> convert(List<Cargo> cargo2) {
		return cargo2.stream().map(CargoDto::new).collect(Collectors.toList());
	}

}
