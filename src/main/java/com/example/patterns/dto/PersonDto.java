package com.example.patterns.dto;

import com.example.patterns.entity.Address;
import com.example.patterns.entity.Person;
import com.example.patterns.entity.Phone;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@ApiModel(value="Person")
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonDto extends BaseDto{

    private Long id;
    private String name;
    private String email;
    private List<Address> addressList;
    private List<Phone> phoneList;

    public Person convertToEntity(){
        return Person
                .builder()
                .id(id)
                .name(name)
                .email(email)
                .phoneList(phoneList)
                .addressList(addressList)
                .build();
    }

}
