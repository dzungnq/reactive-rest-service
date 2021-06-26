package reactive.rest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactive.rest.demo.webclient.GreetingWebClient;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
    }

}
