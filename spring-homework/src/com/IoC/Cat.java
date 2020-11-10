package com.IoC;

public class Cat implements IAnimal{
    @Override
    public String makeSound() {
        return "miau miau";
    }

    @Override
    public String getName() {
        return null;
    }
}
