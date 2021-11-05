package br.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.config.security.TokenService;
import br.dto.FuncionarioDto;
import br.dto.TokenDto;
import br.form.UsuarioForm;
import br.model.Funcionario;
import br.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private AuthenticationManager authManager;
	@Autowired
	private TokenService tokenService;

	@GetMapping
	@Cacheable(value = "listaUsuario")
	public List<FuncionarioDto> lista() {
		List<Funcionario> usuarios = usuarioRepository.findAll();
		return new FuncionarioDto().convert(usuarios);
	}

	@PostMapping("/isUsuario")
	public ResponseEntity<TokenDto> isUsuario(@RequestBody @Valid UsuarioForm form) {
		UsernamePasswordAuthenticationToken dadosLogin = form.convert();

		try {
			Authentication authenticate = authManager.authenticate(dadosLogin);
			String toke = tokenService.gerarToken(authenticate);
			Funcionario usuario = (Funcionario) authenticate.getPrincipal();
			String per = "";
			for (GrantedAuthority perfil : usuario.getAuthorities()) {
				per = perfil.getAuthority();
			}
			return ResponseEntity.ok(new TokenDto(toke, "Bearer", per, usuario.getUsuario()));
		} catch (AuthenticationException e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
