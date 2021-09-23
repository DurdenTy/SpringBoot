import application.service.SpeakerServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class appMain {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(Configuration.class);

        SpeakerServiceInterface service = appContext.getBean("speakerService", SpeakerServiceInterface.class);

        System.out.println(service);

        System.out.println(service.findAll().get(0).getName());

    }

}
