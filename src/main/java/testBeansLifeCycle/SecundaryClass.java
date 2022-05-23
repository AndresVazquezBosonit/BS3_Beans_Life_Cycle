package testBeansLifeCycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(value= 1)
public class SecundaryClass implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------------------------------------------Hola desde clase secundaria!");


    }
}
