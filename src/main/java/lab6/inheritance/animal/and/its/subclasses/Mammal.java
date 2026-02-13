package lab6.inheritance.animal.and.its.subclasses;

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString()+ "]";
    }
}
