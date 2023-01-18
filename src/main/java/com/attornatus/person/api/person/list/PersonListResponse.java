package com.attornatus.person.api.person.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.time.LocalDate;

@Data
public class PersonListResponse {
    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;

}