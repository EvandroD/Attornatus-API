package com.attornatus.person.api.address.create;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class AddressCreateRequest {
    @NotNull
    @JsonProperty(value = "street")
    private String street;

    @NotNull
    @JsonProperty(value = "zipCode")
    private Long zipCode;

    @NotNull
    @JsonProperty(value = "number")
    private Long number;

    @NotNull
    @JsonProperty(value = "city")
    private String city;

    @NotNull
    @JsonProperty(value = "person")
    private AddressCreatePersonRequest person;

    @NotNull
    @JsonProperty(value = "mainAddress")
    private Boolean mainAddress;

}
