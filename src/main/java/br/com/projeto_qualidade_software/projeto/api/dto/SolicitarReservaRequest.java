package br.com.projeto_qualidade_software.projeto.api.dto;

import br.com.projeto_qualidade_software.projeto.enums.TipoSolicitante;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record SolicitarReservaRequest(
        @NotNull @Positive Long salaId,
        @NotNull @Positive Long solicitanteId,
        @NotNull TipoSolicitante tipoSolicitante,
        @NotNull LocalDateTime inicio,
        @NotNull LocalDateTime fim
) {
}