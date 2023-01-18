package com.attornatus.person.api.person.update;

import com.attornatus.person.model.Person;
import com.attornatus.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class PersonUpdateBusinessService {
    @Autowired
    private PersonRepository personRepository;

    public Person update(Long id, Person person) {
        Person existingPerson = personRepository.findById(id).get();

        existingPerson.setName(person.getName());
        existingPerson.setBirthDate(person.getBirthDate());
        
        personRepository.save(existingPerson);

        return person;
    }



}