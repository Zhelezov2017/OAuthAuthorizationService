package tor.zhelezov.sail.keycloak.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class OAuthAuthorizationService {

    public static void main(String[] args) {
        SpringApplication.run(OAuthAuthorizationService.class);
    }
}
