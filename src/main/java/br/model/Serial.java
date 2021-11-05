package br.model;

import javax.persistence.*;

import br.dto.InstalacaoCod;

@Entity
public class Serial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String serial;
	private int status = 0;

	public Serial(InstalacaoCod in) {
		this.serial = in.getCodigo();
	}

	public Serial(String chave1) {
		this.serial = chave1;
	}

	public Long getId() {
		return id;
	}

	public String getSerial() {
		return serial;
	}
	
	public int getStatus() {
		return status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
