package com.attornatus.person.api.person.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.time.LocalDate;

@Data
public class PersonFindResponse {
    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;
}
