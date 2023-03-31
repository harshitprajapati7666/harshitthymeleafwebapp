package com.harshitprajapati.harshitthymeleafwebapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

//    @GetMapping("/france")
//    public Country france() {
//        Country c = Country.of("France", 67);
//        return c;
//    }
//
//    @GetMapping("/all")
//    public List<Country> countries() {
//        Country c1 = Country.of("France", 67);
//        Country c2 = Country.of("Spain", 47);
//
//        return List.of(c1, c2);
//    }

    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country c = Country.of("France", 67);
        return ResponseEntity.status(HttpStatus.ACCEPTED).header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "Cheese and wine").body(c);
    }
}
