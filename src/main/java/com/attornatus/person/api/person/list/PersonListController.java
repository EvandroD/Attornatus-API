package com.attornatus.person.api.person.list;

import com.attornatus.person.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonListController {
    @Autowired
    private PersonListBusinessService businessService;

    @GetMapping(value = "/list")
    @ResponseBody
    public List<PersonListResponse> list() {
        List<Person> people = businessService.list();

        List<PersonListResponse> response = new ArrayList<PersonListResponse>();

        if (people != null && !people.isEmpty()) {
            for (Person person : people) {
                PersonListResponse personResponse = new PersonListResponse();
                personResponse.setId(person.getId());
                personResponse.setName(person.getName());
                personResponse.setBirthDate(person.getBirthDate());

                response.add(personResponse);
            }
        }

        return response;
    }
}