package com.serjer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EIncomeGroup {

    A("1", "0"),
    B("2", "1-12000"),
    C("3", "12001-40000"),
    D("4", "40001+");

    private final String id;
    private final String description;
}
