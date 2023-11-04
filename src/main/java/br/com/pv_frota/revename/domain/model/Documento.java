package br.com.pv_frota.revename.domain.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String link;

    @ManyToOne
    @JoinColumn(name = "sprint_id")
    private Sprint sprint;

    // Getters and setters
}
