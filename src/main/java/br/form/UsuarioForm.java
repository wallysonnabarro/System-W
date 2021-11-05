package br.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class UsuarioForm {
	private String usuario;
	private String senha;
	
	public UsuarioForm(String u, String s) {
		this.senha = s;
		this.usuario = u;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}

	public UsernamePasswordAuthenticationToken convert() {
		return new UsernamePasswordAuthenticationToken(usuario, senha);
	}
	
}
