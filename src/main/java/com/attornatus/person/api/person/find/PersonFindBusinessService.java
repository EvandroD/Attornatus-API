package com.attornatus.person.api.person.find;

import com.attornatus.person.exception.ResourceNotFoundException;
import com.attornatus.person.model.Person;
import com.attornatus.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class PersonFindBusinessService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getList() {
        return personRepository.findAll();
    }

    public Person find(Long id) {
        Person person = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrada"));

        return person;
    }
}
