package com.example.patterns.service;

import com.example.patterns.dto.PersonDto;
import com.example.patterns.dto.ResponsePersonDto;
import com.example.patterns.repository.PersonRepository;

public class PersonService {

    private PersonRepository repository;

    private PhoneService phoneService;

    public ResponsePersonDto createPerson(PersonDto personDto) {

//        Phone phone = createPersonDto.phoneDto.convertToEntity();
//        phoneService.createPhone(phone);
//
//        Person person = createPersonDto.personDto.convertToEntity();
//        repository.save(person);
//        ResponsePersonDto responsePersonDto = new ResponsePersonDto();

        return null;
    }
}
