package IoC;

public class Dog implements IAnimal{
    private String dogName;

    public Dog(String dogName){
        this.dogName = dogName;
    }

    @Override
    public String makeSound() {
        return "ham ham";
    }

    @Override
    public String getName() {
        return dogName;
    }

}
