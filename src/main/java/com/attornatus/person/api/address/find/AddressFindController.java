package com.attornatus.person.api.address.find;

import com.attornatus.person.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressFindController {
    @Autowired
    private AddressFindBusinessService businessService;

    @GetMapping(value = "find/{id}")
    @ResponseBody
    public AddressFindResponse find(@PathVariable long id) {
        Address address = businessService.find(id);

        AddressFindResponse response = new AddressFindResponse();
        response.setId(address.getId());
        response.setStreet(address.getStreet());
        response.setZipCode(address.getZipCode());
        response.setNumber(address.getNumber());
        response.setCity(address.getCity());

        return response;
    }
}