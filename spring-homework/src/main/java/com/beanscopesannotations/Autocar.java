package com.beanscopesannotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Autocar implements Automobil{
    private final double maxDrivingSpeed = 80;
    private Motor motor;

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void travel() {
        System.out.println("Autocar travels");
    }

    @Override
    public double maxDrivingSpeed() {
        return this.maxDrivingSpeed;
    }

    public void travelSafeButUnpleasant(){
        System.out.println("Travel is safe but unpleasant!");
    }
}
