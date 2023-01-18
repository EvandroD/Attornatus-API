package com.attornatus.person.api.address.list;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressListRequest {
    @NotNull
    @JsonProperty(value = "id")
    private Long id;
}
