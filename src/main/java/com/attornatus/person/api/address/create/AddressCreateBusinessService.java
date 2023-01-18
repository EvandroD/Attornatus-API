package com.attornatus.person.api.address.create;

import com.attornatus.person.model.Person;
import com.attornatus.person.repository.AddressRepository;
import com.attornatus.person.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.attornatus.person.exception.ResourceNotFoundException;
import com.attornatus.person.model.Address;;

@Component
@Service
public class AddressCreateBusinessService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PersonRepository personRepository;

    public Address create(Address address) {
        Person person = personRepository.findById(address.getPerson().getId()).orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrada"));

        address.setPerson(person);
        address = addressRepository.save(address);

        return address;
    }
}