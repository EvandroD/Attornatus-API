package com.attornatus.person.api.person.create;

import com.attornatus.person.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonCreateController {
    @Autowired
    private PersonCreateBusinessService businessService;

    @PostMapping(value = "/create")
    @ResponseBody
    public PersonCreateResponse create(@RequestBody PersonCreateRequest request) {
        Person person = new Person();
        person.setName(request.getName());
        person.setBirthDate(request.getBirthDate());

        person = businessService.create(person);

        PersonCreateResponse response = new PersonCreateResponse();
        response.setId(person.getId());
        response.setName(person.getName());
        response.setBirthDate(person.getBirthDate());

        return response;
    }
}