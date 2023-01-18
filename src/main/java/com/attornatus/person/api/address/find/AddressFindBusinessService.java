package com.attornatus.person.api.address.find;

import com.attornatus.person.exception.ResourceNotFoundException;
import com.attornatus.person.model.Address;
import com.attornatus.person.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class AddressFindBusinessService {
    @Autowired
    private AddressRepository addressRepository;

    public Address find(Long id) {
        Address address = addressRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Endereço não encontrado"));

        return address;
    }
}