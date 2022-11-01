package com.nighthawk.spring_portfolio.mvc.PlanetaryData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component // Scans Application for ModelInit Bean, this detects CommandLineRunner
public class PlanetaryDataInit {
    
    // Inject repositories
    @Autowired PlanetaryDataJpaRepository repository;
    
    @Bean
    CommandLineRunner run2() {  // The run() method will be executed after the application starts
        return args -> {
            // Fail safe data validations

            // starting jokes
            final String[] PlanetaryDataArray = {

            };

            // make sure Joke database is populated with starting jokes
            for (String equation : PlanetaryDataArray) {
                List<PlanetaryData> test = repository.findByEquationIgnoreCase(equation);  // JPA lookup

                // UNCOMMENT TO CLEAR DATABASE
                // if (test.size() > 0) {
                //     repository.deleteAll();
                // }

                if (test.size() == 0)
                    repository.save(new PlanetaryData(null, equation, 0, 0)); //JPA save
            }
            
        };
    }
}
