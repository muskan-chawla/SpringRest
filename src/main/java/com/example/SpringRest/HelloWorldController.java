package com.example.SpringRest;

import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping ("/hello")
    public String sayHello(@RequestParam(value="name")String name)
    {
        return "Hello" +name+ "!";
    }
    @PostMapping(value ="/Enterdetails",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     ResponseEntity<PersonResponse> getPerson(@RequestBody PersonRequest ob)
    {
       PersonResponse pq=new PersonResponse(10,"muskan");



    return new ResponseEntity<>(pq, HttpStatus.OK);
    }
}

