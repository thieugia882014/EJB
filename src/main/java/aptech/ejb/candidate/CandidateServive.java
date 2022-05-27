package aptech.ejb.candidate;

import aptech.ejb.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CandidateServive {
    @Autowired
    CandidateRepository candidateRepository;

    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }

    public Candidate save(Candidate obj){
        return candidateRepository.save(obj);
    }
}
