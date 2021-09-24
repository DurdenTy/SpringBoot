package application.repository;

import application.model.Speaker;

import java.util.ArrayList;
import java.util.List;


public class SpeakerRepository implements SpeakerRepositoryInterface {

    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setName("Adilson");
        speaker.setLastName("de Lima");

        speakers.add(speaker);

        return speakers;

    }

}
