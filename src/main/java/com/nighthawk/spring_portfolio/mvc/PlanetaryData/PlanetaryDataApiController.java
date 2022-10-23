package com.nighthawk.spring_portfolio.mvc.PlanetaryData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.net.URI;

@RestController // annotation to simplify the creation of RESTful web services
@RequestMapping("/api/PlanetaryData")  // all requests in file begin with this URI
public class PlanetaryDataApiController {

    // Autowired enables Control to connect URI request and POJO Object to easily for Database CRUD operations
    @Autowired
    private PlanetaryDataJpaRepository repository;

    /* GET List of PlanetaryData
     * @GetMapping annotation is used for mapping HTTP GET requests onto specific handler methods.
     */
    @GetMapping("/")
    public ResponseEntity<List<PlanetaryData>> getPlanetaryData() {
        // ResponseEntity returns List of PlanetaryData provide by JPA findAll()
        return new ResponseEntity<>( repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/get/{planet}")
    public String getPlanet(@PathVariable String planet) {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=" + planet))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    

    // @PutMapping("/share/{id}")
    // public ResponseEntity<PlanetaryData> setShare(@PathVariable long id) {
    //     Optional<PlanetaryData> optional = repository.findById(id);
    //     if (optional.isPresent()) {  // Good ID
    //         PlanetaryData equation = optional.get();
    //         equation.setShare(equation.getShare()+1);
    //         repository.save(equation);
    //         return new ResponseEntity<>(equation, HttpStatus.OK);
    //     }
    //     // Bad ID
    //     return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    // }
}
