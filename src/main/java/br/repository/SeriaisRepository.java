package br.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.model.Serial;

public interface SeriaisRepository extends JpaRepository<Serial, Long>{

	Optional<Serial> findBySerial(String chave1);

	Optional<Serial> findByStatus(int i);

	Serial getBySerial(String codigo);

}
