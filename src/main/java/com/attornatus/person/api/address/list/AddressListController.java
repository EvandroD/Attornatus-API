package com.attornatus.person.api.address.list;

import com.attornatus.person.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressListController {
    @Autowired
    private AddressListBusinessService businessService;

    @GetMapping(value = "/list")
    @ResponseBody
    public List<AddressListResponse> list() {
        List<Address> addressList = businessService.list();

        List<AddressListResponse> response = new ArrayList<AddressListResponse>();

        if (addressList != null && !addressList.isEmpty()) {
            for (Address address : addressList) {
                AddressListResponse addressResponse = new AddressListResponse();
                addressResponse.setId(address.getId());
                addressResponse.setStreet(address.getStreet());
                addressResponse.setZipCode(address.getZipCode());
                addressResponse.setNumber(address.getNumber());
                addressResponse.setCity(address.getCity());

                response.add(addressResponse);

            }
        }

        return response;
    }
}