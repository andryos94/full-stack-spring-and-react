package IoC;

public class Mouse implements IAnimal{

    @Override
    public String makeSound() {
        return "chit chit";
    }

    @Override
    public String getName() {
        return null;
    }
}
