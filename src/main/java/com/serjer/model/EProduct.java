package com.serjer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EProduct {
    CA("Current Account"),
    CAP("Current Account Plus"),
    JSA("Junior Saver Account"),
    STA("Student Account"),
    SNA("Senior Account"),
    DC("Debit Card"),
    CC("Credit Card"),
    GCC("Gold Credit Card");

    private final String name;

}
