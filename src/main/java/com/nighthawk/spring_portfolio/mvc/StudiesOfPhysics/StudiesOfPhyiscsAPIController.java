package com.nighthawk.spring_portfolio.mvc.StudiesOfPhysics;

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
@RequestMapping("/StudiesOfPhysics")  // all requests in file begin with this URI
public class StudiesOfPhyiscsAPIController {

    @GetMapping("/get")
    public String getStudiesOfPhysics() {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://physitionary.p.rapidapi.com/advanced"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "physitionary.p.rapidapi.com")
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
