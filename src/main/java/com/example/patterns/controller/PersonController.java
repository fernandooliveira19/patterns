package com.example.patterns.controller;

import com.example.patterns.dto.PersonDto;
import com.example.patterns.dto.ResponsePersonDto;
import com.example.patterns.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping()
public class PersonController {

    private PersonService personService;


    @PostMapping
    public ResponseEntity<ResponsePersonDto> create(@RequestBody @Valid PersonDto personDto){

        ResponsePersonDto responsePersonDto = personService.createPerson(personDto);

        return ResponseEntity.status(HttpStatus.CREATED.value()).body(responsePersonDto);
    }
}
