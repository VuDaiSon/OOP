package lab7.polymorphism.abstraction.animal;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void greets();

}
