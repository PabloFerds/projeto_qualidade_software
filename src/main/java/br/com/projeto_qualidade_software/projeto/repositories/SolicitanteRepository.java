package br.com.projeto_qualidade_software.projeto.repositories;

import br.com.projeto_qualidade_software.projeto.entities.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SolicitanteRepository extends JpaRepository<Solicitante, Long> {

    Optional<Solicitante> findByEmailIgnoreCase(String email);
}