package application.repository;

import application.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("speakerRepository")
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
