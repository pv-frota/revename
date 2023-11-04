package br.com.pv_frota.revename.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Integer diaPadraoFaturamento;

    @ManyToOne
    @JoinColumn(name = "cliente_final_id")
    private Cliente clienteFinal;
}
