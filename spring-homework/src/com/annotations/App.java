package com.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1);

        bankAccount.setAmount(200);
        System.out.println(bankAccount.getAmount());

        UserAccount userAccount = new UserAccount();
        System.out.println(userAccount.getId());

        // citeste fisierul de configurare
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // obtine bean-ul din container-ul de spring
        ITeacher teacher = context.getBean("webDevTeacher", ITeacher.class);
        // foloseste functionalitatile bean-ului
        System.out.println(teacher.getHomeWork());
        // inchide contextul
        context.close();
    }
}
