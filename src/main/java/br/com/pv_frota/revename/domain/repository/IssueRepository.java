package br.com.pv_frota.revename.domain.repository;

import br.com.pv_frota.revename.domain.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
}
