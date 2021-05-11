package tor.zhelezov.sail.keycloak.server.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KeycloakServerProperties {
    String contextPath = "/auth";
    String realmImportFile = "realm.json";
    AdminUser adminUser = new AdminUser();
}
