package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import application.model.Speaker;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("Dev")
public class SpeakerService implements SpeakerServiceInterface{

    @Autowired
    private SpeakerRepositoryInterface speakerRepo;

    public List<Speaker> findAll(){

        return speakerRepo.findAll();

    }

    public SpeakerService(){}

    public void setSpeakerRepository(SpeakerRepositoryInterface repository){

        this.speakerRepo = repository;

    }

    @PostConstruct
    private void initialize(){
        System.out.println("init");
    }

    public SpeakerService(SpeakerRepositoryInterface repository){

        this.speakerRepo = repository;

    }

}
