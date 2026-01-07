package com.example.demo.Config;


import com.example.demo.Model.Car;
import com.example.demo.Model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {
    @Bean
    public Student student(){
        return new Student();
    }
    @Bean
    public Car engine(){

        return new Car("fortuner","toyata");
    }
}
