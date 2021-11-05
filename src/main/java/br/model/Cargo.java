package br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;

import br.dto.CargoDto;

@Entity
public class Cargo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cargo;

	public Cargo() {
	}

	public Cargo(@Valid CargoDto form) {
		this.cargo = form.getCargo();
	}

	public Long getId() {
		return id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
