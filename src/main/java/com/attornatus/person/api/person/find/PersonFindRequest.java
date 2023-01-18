package com.attornatus.person.api.person.find;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PersonFindRequest {
    @NotNull
    @JsonProperty(value = "id")
    private Long id;

}
