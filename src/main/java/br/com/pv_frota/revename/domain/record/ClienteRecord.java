package br.com.pv_frota.revename.domain.record;

import br.com.pv_frota.revename.domain.model.Cliente;
import br.com.pv_frota.revename.infrastructure.interfaces.ConvertsTo;

public record ClienteRecord(Long id, String nome, String descricao, Integer diaPadraoFaturamento,
                            ClienteRecord clienteFinal) implements ConvertsTo<Cliente> {

    public Cliente recordToEntity() {
        return Cliente
                .builder()
                .id(id)
                .nome(nome)
                .descricao(descricao)
                .diaPadraoFaturamento(diaPadraoFaturamento)
                .clienteFinal(clienteFinal != null ? clienteFinal.recordToEntity() : null)
                .build();
    }

}
