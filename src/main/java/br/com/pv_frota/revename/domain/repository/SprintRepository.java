package br.com.pv_frota.revename.domain.repository;

import br.com.pv_frota.revename.domain.model.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long> {
}

