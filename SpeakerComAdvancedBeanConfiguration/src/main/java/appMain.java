
import application.service.SpeakerServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class appMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerServiceInterface service = context.getBean("speakerService", SpeakerServiceInterface.class);

        System.out.println(service.findAll().get(0).getName());

    }

}
