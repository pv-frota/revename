package br.com.pv_frota.revename.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date prazo;

    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;

    // Getters and setters
}
