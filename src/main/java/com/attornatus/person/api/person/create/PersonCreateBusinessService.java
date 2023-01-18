package com.attornatus.person.api.person.create;

import com.attornatus.person.model.Person;
import com.attornatus.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class PersonCreateBusinessService {
    @Autowired
    private PersonRepository personRepository;

    public Person create(Person person) {
        person = personRepository.save(person);

        return person;
    }
}