package com.beanscopesannotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class GarajComp {
    @Autowired
    private Motocicleta motocicleta;
    private Masina masina;
    private Autocar autocar;

    //@Autowired, sau fara @Autowired conform: Containerul de spring cauta in mod automat un bean de tipul dependintei (FrameworkKnowledge) si il injecteaza prin intermediul constructorului pus la dispozitie.
    public GarajComp(Masina masina){
        this.masina = masina;
    }

    @Autowired
    public void setAutocar(Autocar autocar) {
        this.autocar = autocar;
    }
}
