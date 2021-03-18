package com.serjer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EAgeGroup {
    A("1", "0-17"),
    B("2", "18-64"),
    C("3", "65+");

    private final String id;
    private final String description;
}
