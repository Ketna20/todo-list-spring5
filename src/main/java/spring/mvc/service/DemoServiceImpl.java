package spring.mvc.service;
/*
 * ketna khalasi created on 7/4/20
 * */
import org.springframework.stereotype.Service;



@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Application";
    }
}
