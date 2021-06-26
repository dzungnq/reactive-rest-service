package reactive.rest.demo.webclient;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class GreetingWebClient {
    private WebClient client = WebClient.create("http://localhost:8080");

    public String getResult(){
        return ">>result = " + client.get()
                .uri("/hello")
                .accept(MediaType.TEXT_PLAIN)
                .exchangeToMono(response -> response.bodyToMono(String.class))
                .block();
    }
}
