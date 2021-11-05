package br.dto;

public class TokenDto {

	private String usuario;
	private String tipo;
	private String token;
	private String permissao;

	public TokenDto() {
	}

	public TokenDto(String token, String tipo, String permissao, String usuario) {
		this.token = token;
		this.tipo = tipo;
		this.permissao = permissao;
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getPermissao() {
		return permissao;
	}

	public String getTipo() {
		return tipo;
	}

	public String getToken() {
		return token;
	}
}
