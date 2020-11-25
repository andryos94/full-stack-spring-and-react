package com.beanscopesannotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class Garaj {

    @Autowired
    @Qualifier("masina")
    public Automobil automobil;

    public void autoTravel(){
        automobil.travel();
        System.out.println(automobil.maxDrivingSpeed());
    }
}
