package br.com.pv_frota.revename.service;

import br.com.pv_frota.revename.MySQLTestContainer;
import br.com.pv_frota.revename.domain.model.Cliente;
import br.com.pv_frota.revename.domain.record.ClienteRecord;
import br.com.pv_frota.revename.domain.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteServiceTest extends MySQLTestContainer {
    private final ClienteService underTest;

    @Test
    void deveSalvar() {
        //given
        ClienteRecord clienteFinal = new ClienteRecord(null, "Banco da Amazônia", "Banco", 15, null);
        ClienteRecord cliente = new ClienteRecord(null, "Stefanini", "Terceirizada do BASA", 15, clienteFinal);
        //when
        Cliente c = underTest.salvar(cliente);
        //then
        Cliente expected = underTest.obterPorId(c.getId());

        assertThat(expected).isNotNull();
    }
}
