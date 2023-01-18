package com.attornatus.person.api.person.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.time.LocalDate;

import javax.validation.constraints.NotNull;

@Data
public class PersonUpdateRequest {
    @NotNull
    @JsonProperty(value = "name")
    private String name;

    @NotNull
    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;

}