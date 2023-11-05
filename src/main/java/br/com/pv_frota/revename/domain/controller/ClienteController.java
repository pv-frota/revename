package br.com.pv_frota.revename.domain.controller;

import br.com.pv_frota.revename.domain.model.Cliente;
import br.com.pv_frota.revename.domain.record.ClienteRecord;
import br.com.pv_frota.revename.domain.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClienteController {
    private final ClienteService service;

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody ClienteRecord record) {
        Cliente cliente = service.salvar(record);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }
}
