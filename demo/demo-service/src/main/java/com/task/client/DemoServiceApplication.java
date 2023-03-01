package com.task.client;

import com.google.gson.Gson;
import com.task.client.jpa.Client;
import com.task.client.jpa.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.FileReader;
import java.util.List;


@EntityScan(basePackages = {"com.task.client.jpa"})
@SpringBootApplication(scanBasePackages = {"com.task.client"})
public class DemoServiceApplication implements CommandLineRunner {


    @Lazy
    @Autowired
    ClientRepository clientRepository;
    static String filePath = null;

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Gson gson = new Gson();
        filePath = args[0];
        Client[] objects = gson.fromJson(new FileReader(filePath), Client[].class);
        clientRepository.saveAll(List.of(objects));

    }
}

