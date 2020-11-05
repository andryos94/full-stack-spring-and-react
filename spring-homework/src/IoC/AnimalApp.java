package IoC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal theAnimal1 = context.getBean("myCat", Cat.class);
        IAnimal theAnimal2 = context.getBean("myDog", Dog.class);
        //when add a constructor for Dog, the bean doesn't see the default one. Solution: add the attribute "constructor-arg" for myDog bean
        System.out.println(theAnimal1.makeSound());
        System.out.println(theAnimal2.getName() + ": " + theAnimal2.makeSound());

        context.close();
    }
}
