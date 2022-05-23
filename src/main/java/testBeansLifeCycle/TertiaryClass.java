package testBeansLifeCycle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(value= 2)
public class TertiaryClass implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("-----------------------------------------------Soy la tercera clase!");
   for(int i=0; i<args.length; i++ ){
     String arg =args[i];
      System.out.println("Argumento " + (i+1) + ": " + arg);
   }
  }
}
