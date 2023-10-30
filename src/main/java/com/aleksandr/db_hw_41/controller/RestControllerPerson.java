package com.aleksandr.db_hw_41.controller;

import com.aleksandr.db_hw_41.domain.Person;
import com.aleksandr.db_hw_41.service.ServicePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("persons")
public class RestControllerPerson {

    @Autowired
    private ServicePerson servicePerson;

    @GetMapping("/by-city")
    public ResponseEntity<List<Person>> getPersonsByCity(@RequestParam String city) {
        return new ResponseEntity<>(servicePerson.getPersonsByCity(city), HttpStatus.ACCEPTED);
    }
}
