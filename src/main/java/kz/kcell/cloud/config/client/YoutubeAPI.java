package kz.kcell.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class YoutubeAPI {

    @Value("${youtube.datasource.users.username}")
    private String username;

    @Value("${youtube.datasource.users.password}")
    private String password;

    @GetMapping("test")
    public String testYoutube() {
        return String.format("username=%s  password=%s",username,password);
    }
}
