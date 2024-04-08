package laborator2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
    public static void main(String[] args){

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world!");
    }
}
