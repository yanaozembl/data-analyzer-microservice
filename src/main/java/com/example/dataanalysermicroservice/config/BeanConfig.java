package com.example.dataanalysermicroservice.config;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    @SneakyThrows
    public XML consumerXML() {
        return new XMLDocument(
                getClass().getResourceAsStream("/kafka/consumer.xml").
                        readAllBytes()
        );
    }
}
