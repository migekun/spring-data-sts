package org.formacio.servei;

import java.util.Optional;

import org.formacio.domain.Persona;
import org.formacio.repositori.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {

	@Autowired
	private PersonaRepository repositori;
	
	public Optional<Persona> carrega(long codi) {
		return repositori.findById(codi);
		
	}
}
