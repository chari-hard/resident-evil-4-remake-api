package org.capcom.re4r.repositories;

import org.capcom.re4r.entities.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
}
