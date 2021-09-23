import application.repository.SpeakerRepository;
import application.repository.SpeakerRepositoryInterface;
import application.service.SpeakerService;
import application.service.SpeakerServiceInterface;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
@ComponentScan({"application"})
public class Configuration {

   /*
   @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerServiceInterface getSpeakerService(){

       // SpeakerService service = new SpeakerService(getSpeakerRepository());
         SpeakerService service = new SpeakerService();
        return service;

    }
*/
    /*@Bean(name = "speakerRepository")
    public SpeakerRepositoryInterface getSpeakerRepository(){
        return new SpeakerRepository();
    }*/

}
