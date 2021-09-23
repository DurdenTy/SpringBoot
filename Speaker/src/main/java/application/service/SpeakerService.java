package application.service;

import application.model.Speaker;
import application.repository.SpeakerRepository;
import application.repository.SpeakerRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("speakerService")
public class SpeakerService implements SpeakerServiceInterface{

    private SpeakerRepositoryInterface speakerRepo;


    public SpeakerService(){
        System.out.println("No args constructor");
    }

    @Autowired
    public SpeakerService(SpeakerRepositoryInterface speakerRepository){

        System.out.println("args repo constructor");
        speakerRepo = speakerRepository;

    }

    public List<Speaker> findAll(){

        return speakerRepo.findAll();

    }

    public void setRepository(SpeakerRepositoryInterface repository){

        System.out.println("set repo");
        this.speakerRepo = repository;
    }



}
