package aptech.ejb.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("api/v1/candidate")
public class CandidateApi {

    @Autowired
    CandidateServive candidateServive;

    @RequestMapping(method = RequestMethod.GET)
    public List<Candidate> findAll(){
        return candidateServive.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public Candidate save(@RequestBody Candidate obj){
        return candidateServive.save(obj);
    }
}
