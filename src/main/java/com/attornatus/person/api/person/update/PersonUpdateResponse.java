package com.attornatus.person.api.person.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.time.LocalDate;

@Data
public class PersonUpdateResponse {
    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;

}