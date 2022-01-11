package net.proselyte.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;


@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);

    }


}
//@SpringBootApplication
//@ComponentScan("net.proselyte.springboot.controller")
//public class SpringbootApplication{
//
//    public static void main(String[] args) throws IOException {
//        SpringApplication.run(SpringbootApplication.class, args);
//        openHomePage();
//    }
//
//    private static void openHomePage() throws IOException {
//        Runtime rt = Runtime.getRuntime();
//        rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080");
//    }
//}