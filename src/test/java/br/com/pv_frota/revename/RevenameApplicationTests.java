package br.com.pv_frota.revename;

import br.com.pv_frota.revename.domain.model.Desenvolvedor;
import br.com.pv_frota.revename.domain.repository.DesenvolvedorRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class RevenameApplicationTests extends MySQLTestContainer {

    private final DesenvolvedorRepository underTest;
    @Test
    void contextLoads() {
        //given
        Long selectedUser = 1L;
        //when
        Desenvolvedor expected = underTest.getReferenceById(selectedUser);
        //then
        assertThat(expected.getId()).isEqualTo(selectedUser);
    }

}
