package com.attornatus.person.api.address.create;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class AddressCreatePersonRequest {
    @NotNull
    @JsonProperty(value = "id")
    private Long id;
}