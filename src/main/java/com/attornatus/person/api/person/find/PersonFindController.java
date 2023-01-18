package com.attornatus.person.api.person.find;

import com.attornatus.person.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonFindController {
    @Autowired
    private PersonFindBusinessService businessService;

    @GetMapping(value = "/find/{id}")
    @ResponseBody
    public PersonFindResponse find(@PathVariable Long id) {
        Person person = businessService.find(id);

        PersonFindResponse response = new PersonFindResponse();
        response.setId(person.getId());
        response.setName(person.getName());
        response.setBirthDate(person.getBirthDate());

        return response;
    }
}
