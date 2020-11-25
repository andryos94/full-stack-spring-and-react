package com.beanscopesannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Garaj garaj = context.getBean("garaj", Garaj.class);

        garaj.autoTravel();//Masina travels\n 200.0

        GarajComp garajComp = context.getBean("garajComp", GarajComp.class);

        //Motocicleta travels\n 115.5\n Travel is not safe!  -> @Autowired on the "motocicleta" field
        Motocicleta motocicleta = garajComp.getMotocicleta();
        motocicleta.travel();
        System.out.println(motocicleta.getMaxDrivingSpeed());
        motocicleta.travelNotSafe();

        //Masina travels\n Travel is safe and pleasant!  -> @Autowired pe construcotrul cu parametru de tip Masina; merge si fara @Autowired
        garajComp.getMasina().travel();
        garajComp.getMasina().travelSafeAndPleasant();

        //Travel is safe but unpleasent -> @Autowired pe setter-ul tipului Autocar
        garajComp.getAutocar().travelSafeButUnpleasant();

        /*Motor motorMotocicleta = new Motor();
        motorMotocicleta.setPutere(100);
        motocicleta.setMotor(motorMotocicleta);*/
        System.out.println("Motocicleta are " + motocicleta.getMotor().getPutere() + " cai putere!");

        Masina masina = garajComp.getMasina();
        System.out.println("Masina are " + masina.getMotor().getPutere() + " cai putere!");

        Autocar autocar = garajComp.getAutocar();
        System.out.println("Autocarul are " + autocar.getMotor().getPutere() + " cai putere!");
    }

}
