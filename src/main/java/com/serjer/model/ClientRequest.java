package com.serjer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientRequest {
    private String ageGroup;
    private Boolean isStudent;
    private String incomeGroup;
}
