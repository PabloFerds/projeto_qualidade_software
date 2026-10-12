package br.com.projeto_qualidade_software.projeto.entities;

import br.com.projeto_qualidade_software.projeto.enums.StatusSala;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Min(20)
    @Column(nullable = false)
    private Integer capacidade;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusSala statusSala = StatusSala.DISPONIVEL;

    public Sala() {
    }

    public Sala(Long id, Integer capacidade, StatusSala statusSala) {
        this.id = id;
        this.capacidade = capacidade;
        this.statusSala = statusSala;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public StatusSala getStatusSala() {
        return statusSala;
    }

    public void setStatusSala(StatusSala statusSala) {
        this.statusSala = statusSala;
    }
}