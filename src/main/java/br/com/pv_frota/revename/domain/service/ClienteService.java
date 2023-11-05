package br.com.pv_frota.revename.domain.service;

import br.com.pv_frota.revename.domain.model.Cliente;
import br.com.pv_frota.revename.domain.record.ClienteRecord;
import br.com.pv_frota.revename.domain.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteService {
    private final ClienteRepository repository;

    public Cliente salvar(ClienteRecord clienteRecord) {
        Cliente cliente = clienteRecord.recordToEntity();
        return repository.save(cliente);
    }

    public Cliente obterPorId(Long id) {
        return repository.getReferenceById(id);
    }
}
