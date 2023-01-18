package com.attornatus.person.api.person.list;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PersonListRequest {
    @NotNull
    @JsonProperty(value = "id")
    private Long id;
}