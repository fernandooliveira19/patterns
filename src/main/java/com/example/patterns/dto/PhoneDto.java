package com.example.patterns.dto;

import com.example.patterns.entity.Phone;

public class PhoneDto extends BaseDto{

    private Integer prefix;
    private String number;

    public Phone convertToEntity(){
        Phone phone = Phone.builder()
                .prefix(prefix)
                .number(number)
                .build();
        return phone;

    }
}
