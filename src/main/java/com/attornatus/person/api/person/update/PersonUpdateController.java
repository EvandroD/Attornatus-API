package com.attornatus.person.api.person.update;

import com.attornatus.person.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonUpdateController {
    @Autowired
    private PersonUpdateBusinessService businessService;

    @PutMapping(value = "update/{id}")
    @ResponseBody
    public PersonUpdateResponse update(@PathVariable Long id, @RequestBody PersonUpdateRequest request) {
        Person person = businessService.update(id, new Person());
        person.setName(request.getName());
        person.setBirthDate(request.getBirthDate());

        person = businessService.update(id, person);

        PersonUpdateResponse response = new PersonUpdateResponse();
        response.setId(person.getId());
        response.setName(person.getName());
        response.setBirthDate(person.getBirthDate());

        return response;


    }
}