package de.predic8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpeakerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpeakerServiceApplication.class, args);
    }
}
