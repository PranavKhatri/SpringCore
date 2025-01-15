package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }
    @Bean
    Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean
    Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("F8");
        return vehicle;
    }

    @Primary
    @Bean("myBean")
    Vehicle vehicle4(){
        var vehicle = new Vehicle();
        vehicle.setName("Primary-F8");
        return vehicle;
    }

    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer integer(){
        return 16;
    }


}
