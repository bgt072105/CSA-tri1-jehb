package com.nighthawk.spring_portfolio.mvc.PlanetaryData;

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
@RequestMapping("/PlanetaryData")
public class JsonPlanetaryDataAPIController {
    private JSONObject body;
    private HttpStatus status;

    @GetMapping("/mercury")
    public ResponseEntity<JSONObject> getMercury() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=mercury"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
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

    @GetMapping("/venus")
    public ResponseEntity<JSONObject> getVenus() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=venus"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
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
    @GetMapping("/earth")
    public ResponseEntity<JSONObject> getEarth() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=earth"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
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
    @GetMapping("/mars")
    public ResponseEntity<JSONObject> getMars() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=mars"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
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
    @GetMapping("/jupiter")
    public ResponseEntity<JSONObject> getJupiter() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=jupiter"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
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
    @GetMapping("/saturn")
    public ResponseEntity<JSONObject> getSaturn() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=saturn"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
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
    @GetMapping("/uranus")
    public ResponseEntity<JSONObject> getUranus() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=uranus"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
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
    @GetMapping("/Neptune")
    public ResponseEntity<JSONObject> getNeptune() {
        try {  
            
            //RapidAPI header
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://planets-by-api-ninjas.p.rapidapi.com/v1/planets?name=neptune"))
            .header("X-RapidAPI-Key", "3d43659d98msh26d5e705bc7d8b6p1d6431jsnba44357aaf20")
            .header("X-RapidAPI-Host", "planets-by-api-ninjas.p.rapidapi.com")
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