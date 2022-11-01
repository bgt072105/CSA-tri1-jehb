package com.nighthawk.spring_portfolio.mvc.StudiesOfPhysics;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/StudiesOfPhysics")
public class JsonStudiesOfPhysicsAPIController {
    private JSONObject body;
    private HttpStatus status;

    @GetMapping("/studies")
    public ResponseEntity<JSONObject> getStudies() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://physitionary.p.rapidapi.com/advanced"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "physitionary.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(response.body());
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("obj", obj);
            this.body = jsonObject;
            this.status = HttpStatus.OK;
        }
        catch (Exception e) {  
             HashMap<String, String> status = new HashMap<>();
            status.put("status", "RapidApi failure: " + e);

            this.body = (JSONObject) status;
            this.status = HttpStatus.INTERNAL_SERVER_ERROR; 
        }

        return new ResponseEntity<>(body, status);
    }
}