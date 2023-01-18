package com.attornatus.person.api.person.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.time.LocalDate;

import javax.validation.constraints.NotNull;

@Data
public class PersonCreateRequest {
    @NotNull
    @JsonProperty(value = "name")
    private String name;

    @NotNull
    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;

}