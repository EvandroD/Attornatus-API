package com.attornatus.person.api.address.find;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AddressFindRequest {
    @NotNull
    @JsonProperty(value = "id")
    private Long id;
}
