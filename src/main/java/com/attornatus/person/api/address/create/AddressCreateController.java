package com.attornatus.person.api.address.create;

import com.attornatus.person.model.Address;
import com.attornatus.person.model.Person;

import lombok.Data;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping("/address")
public class AddressCreateController {
    @Autowired
    private AddressCreateBusinessService businessService;

    @PostMapping(value = "/create")
    @ResponseBody
    public AddressCreateResponse create(@RequestBody @Valid AddressCreateRequest request) {
        Person person = new Person();
        person.setId(request.getPerson().getId());
        Address address = new Address();

        address.setStreet(request.getStreet());
        address.setZipCode(request.getZipCode());
        address.setNumber(request.getNumber());
        address.setCity(request.getCity());
        address.setPerson(person);

        address = businessService.create(address);

        AddressCreateResponse response = new AddressCreateResponse();
        response.setId(address.getId());
        response.setStreet(address.getStreet());
        response.setZipCode(request.getZipCode());
        response.setNumber(request.getNumber());
        response.setCity(request.getCity());

        return response;
    }
}

