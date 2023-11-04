package br.com.pv_frota.revename.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Date prazoGeral;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
