package com.attornatus.person.api.address.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressFindResponse {
    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "street")
    private String street;

    @JsonProperty(value = "zipCode")
    private Long zipCode;

    @JsonProperty(value = "number")
    private Long number;

    @JsonProperty(value = "city")
    private String city;
}