package aptech.ejb.repository;

import aptech.ejb.candidate.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate,Integer> {
}
