package com.attornatus.person.api.person.list;

import com.attornatus.person.model.Person;
import com.attornatus.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class PersonListBusinessService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> list() {
        List<Person> people = personRepository.findAll();

        return people;
    }
}