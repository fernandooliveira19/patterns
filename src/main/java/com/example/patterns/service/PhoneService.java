package com.example.patterns.service;

import com.example.patterns.dto.PhoneDto;
import com.example.patterns.entity.Phone;
import com.example.patterns.repository.PhoneRepository;

public class PhoneService {

    private PhoneRepository repository;

    public Phone createPhone(Phone phone){

        return repository.save(phone);
    }
}
