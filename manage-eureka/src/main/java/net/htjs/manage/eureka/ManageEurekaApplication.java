package net.htjs.manage.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ManageEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageEurekaApplication.class, args);
    }

}
