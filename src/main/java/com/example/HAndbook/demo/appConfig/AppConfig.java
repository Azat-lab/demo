package com.example.HAndbook.demo.appConfig;

import com.example.HAndbook.demo.HandbookService;
import com.example.HAndbook.demo.service.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class AppConfig {
    @Bean
    public HandbookService HandbookService(){
        return new HandbookService() {
            @Override
            public void add(Country country) {

            }

            @Override
            public void save(Country country) {

            }

            @Override
            public void delete(long id) {

            }

            @Override
            public void search(long id) {

            }

            @Override
            public void update(Country country) {

            }

            @Override
            public List<Country> getCountry() {
                return null;
            }

            @Override
            public Optional<Country> findById(long Id) {
                return Optional.empty();
            }

            @Override
            public Optional<Country> findByName(String name) {
                return Optional.empty();
            }

        };
    }
}





