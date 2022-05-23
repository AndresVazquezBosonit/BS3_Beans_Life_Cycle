package testBeansLifeCycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class BeansLifeCycleApplication{

  public static void main(String[] args) {
    SpringApplication.run(BeansLifeCycleApplication.class, args);
    System.out.println("APP READY!!!");
  }

}
