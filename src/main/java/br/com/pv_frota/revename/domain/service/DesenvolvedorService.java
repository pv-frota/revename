package br.com.pv_frota.revename.domain.service;

import br.com.pv_frota.revename.domain.repository.DesenvolvedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DesenvolvedorService {
    private DesenvolvedorRepository desenvolvedorRepository;

    // Implement your service methods here
}

