package com.beanscopesannotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Motocicleta implements Automobil{
    private final double maxDrivingSpeed = 115.5;
    @Autowired
    private Motor motor;

    @Override
    public void travel() {
        System.out.println("Motocicleta travels");
    }

    @Override
    public double maxDrivingSpeed() {
        return this.maxDrivingSpeed;
    }

    public void travelNotSafe(){
       System.out.println("Travel is not safe!");
    }
}
