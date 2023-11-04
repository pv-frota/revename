package br.com.pv_frota.revename.domain.repository;

import br.com.pv_frota.revename.domain.model.API;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends JpaRepository<API, Long> {
}

