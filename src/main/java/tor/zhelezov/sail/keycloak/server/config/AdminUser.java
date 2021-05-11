package tor.zhelezov.sail.keycloak.server.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminUser {
    String username = "admin";
    String password = " admin";
}
