package com.gxq.creation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CreationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreationApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello 111";
    }

}
