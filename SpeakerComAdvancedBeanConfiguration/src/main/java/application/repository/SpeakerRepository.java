package application.repository;

import application.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@Repository("speakerRepository")
@Profile("Dev")
public class SpeakerRepository implements SpeakerRepositoryInterface {

    @Autowired
    private Calendar cal;

    @Value("#{T(java.land.Math).random() * 100}")
    private double seedNum;

    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setName("Adilson");
        speaker.setLastName("de Lima");
        speaker.setSeedName(seedNum);

        System.out.println("calendar: " + cal.getTime());

        speakers.add(speaker);

        return speakers;

    }

}
