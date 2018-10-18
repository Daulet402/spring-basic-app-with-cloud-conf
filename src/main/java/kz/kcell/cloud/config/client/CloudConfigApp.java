package kz.kcell.cloud.config.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class CloudConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigApp.class, args);
    }
}
