package application.service;

import application.model.Speaker;
import application.repository.SpeakerRepositoryInterface;

import java.util.List;

public class SpeakerService implements SpeakerServiceInterface{

    private SpeakerRepositoryInterface speakerRepo;

    public List<Speaker> findAll(){

        return speakerRepo.findAll();

    }

    public SpeakerService(){}

    public void setSpeakerRepository(SpeakerRepositoryInterface repository){

        this.speakerRepo = repository;

    }

    public SpeakerService(SpeakerRepositoryInterface repository){

        this.speakerRepo = repository;

    }

}
