package com.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTask {
    public static void main(String[] args) {
        System.out.println("----- Before context initialization");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("----- Before getBean of prototype calls");

        context.getBean("prototypeTask", Task.class);
        context.getBean("prototypeTask", Task.class).run();
        context.getBean("prototypeTask", Task.class);
        System.out.println("----- After getBean of prototype calls");



//        System.out.println("----- Before getBean of singleton calls");
//
//        System.out.println("The " + context.getBean("singletonTask", Task.class).getTaskName() + " was destroyed!");
//        System.out.println("The " + context.getBean("singletonTask", Task.class).getTaskName() + " was destroyed!");
//        System.out.println("The " + context.getBean("singletonTask", Task.class).getTaskName() + " was destroyed!");
//        System.out.println("Number of task after deleting: " + Task.getNumberOfTasks());
//        System.out.println("----- After getBean of singleton calls");

        // close the context
        context.close();
        System.out.println("----- After context closed");
    }
}
