package dzien4.web;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class GPTClient {

    private final static String URL = "https://hook.eu1.make.com/iuigvufwtgv05yed9f9r0qcyw2939g1j";
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient
                .newBuilder()
                .connectTimeout(Duration.ofSeconds(60))
                .build();

        HttpRequest request =HttpRequest
                .newBuilder()
                .POST(HttpRequest.BodyPublishers.noBody())
                .uri(URI.create(URL))
                .build();

        //HttpResponse<GPTResponse> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
