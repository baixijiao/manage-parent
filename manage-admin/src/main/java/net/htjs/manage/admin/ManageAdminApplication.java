package net.htjs.manage.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class ManageAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageAdminApplication.class, args);
    }

}
