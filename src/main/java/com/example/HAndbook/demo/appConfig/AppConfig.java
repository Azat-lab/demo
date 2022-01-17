package com.example.HAndbook.demo.appConfig;

import com.example.HAndbook.demo.Handbook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Handbook handbook(){
        return new Handbook() {
            @Override
            public void add() {
            }
            @Override
            public void delete() {
            }
            @Override
            public void search() {
            }
            @Override
            public void update() {
            }
        };
    }
}
