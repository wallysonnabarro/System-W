package br.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.model.Funcionario;

public interface UsuarioRepository extends JpaRepository<Funcionario, Long> {

	Optional<Funcionario> findByUsuario(String usuario);
	Optional<Funcionario> findByUsuarioAndSenha(String usuario, String senha);

}
