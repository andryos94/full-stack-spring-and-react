package com.annotations;


import lombok.Getter;
import lombok.Setter;

import java.util.Random;

public class UserAccount {
    @Getter
    private final int id;
    @Getter @Setter
    private String userDetails;

    public UserAccount(){
        this.id = (new Random()).nextInt();
    }

}
