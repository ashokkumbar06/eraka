package com.Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("    A        SSSSS      H       H      OOOO      K      K  ");
        System.out.println("   A A      S     S     H       H     O    O     K    K    ");
        System.out.println("  AAAAA     S     s     H H H H H     O    O     K  K      ");
        System.out.println(" A     A    S     S     H       H     O    O     K    K    ");
        System.out.println("A       A    SSSSS      H       H      OOOO      K      K  ");
    }
}