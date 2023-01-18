package com.attornatus.person.api.address.list;

import com.attornatus.person.model.Address;
import com.attornatus.person.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class AddressListBusinessService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> list() {
        List<Address> address = addressRepository.findAll();

        return address;
    }
}
