package br.controller;

import static util.Seriais.CHAVE1;
import static util.Seriais.CHAVE2;
import static util.Seriais.CHAVE3;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dto.InstalacaoCod;
import br.dto.Status;
import br.model.Serial;
import br.repository.SeriaisRepository;

@RestController
@RequestMapping("/instalacao")
public class SeriaisController {

	@Autowired
	private SeriaisRepository repository;

	@GetMapping("/salvar")
	@Transactional
	@CacheEvict(value = "status", allEntries = true)
	public ResponseEntity<Build> Registrar() {
		Optional<Serial> op1 = repository.findBySerial(CHAVE1);
		if (!op1.isPresent()) {
			repository.save(new Serial(CHAVE1));
		}
		Optional<Serial> op2 = repository.findBySerial(CHAVE2);
		if (!op2.isPresent()) {
			repository.save(new Serial(CHAVE2));
		}
		Optional<Serial> op3 = repository.findBySerial(CHAVE3);
		if (!op3.isPresent()) {
			repository.save(new Serial(CHAVE3));
		}
		return ResponseEntity.badRequest().build();
	}

	@GetMapping("status")
	@Cacheable(value = "status")
	public ResponseEntity<Status> validar() {
		Optional<Serial> s = repository.findByStatus(1);
		if (s.isPresent()) {
			return ResponseEntity.ok(new Status(1));
		}
		return ResponseEntity.ok(new Status(0));
	}

	@PutMapping("/registrar")
	@Transactional
	@CacheEvict(value = "status", allEntries = true)
	public ResponseEntity<Build> atualizar(@RequestBody @Validated InstalacaoCod cod) {

		Optional<Serial> op = repository.findBySerial(cod.getCodigo());

		if (op.isPresent()) {
			Serial serial = repository.getBySerial(cod.getCodigo());
			serial.setStatus(1);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.badRequest().build();
	}
}
