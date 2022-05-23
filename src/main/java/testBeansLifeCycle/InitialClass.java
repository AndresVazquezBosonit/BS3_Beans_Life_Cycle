package testBeansLifeCycle;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class InitialClass {
    public String saidHello(){
    System.out.println("Hello, im the bean method! :D");
    return "Hi";
    }

    @PostConstruct
    public void init(){
    System.out.println("-------------------------------------------Hola desde clase inicial");
    }
    @PreDestroy
    public void destroy(){
    System.out.println("Bean destroy");
    }
}
