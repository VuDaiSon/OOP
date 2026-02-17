package lab7.polymorphism.abstraction.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
