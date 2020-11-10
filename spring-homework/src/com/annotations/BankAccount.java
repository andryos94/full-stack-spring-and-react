package com.annotations;

import lombok.Data;

@Data
public class BankAccount {
    private final int id;
    private String firstName;
    private String secondName;
    private double amount;
}
