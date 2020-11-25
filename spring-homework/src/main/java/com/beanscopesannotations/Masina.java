package com.beanscopesannotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Masina implements Automobil {
    private final double maxDrivingSpeed = 200;
    private Motor motor;

    public Masina(Motor motor){
        this.motor = motor;
    }

    @Override
    public void travel() {
        System.out.println("Masina travels");
    }

    @Override
    public double maxDrivingSpeed() {
        return this.maxDrivingSpeed;
    }

    public void travelSafeAndPleasant(){
        System.out.println("Travel is safe and pleasant!");
    }
}
