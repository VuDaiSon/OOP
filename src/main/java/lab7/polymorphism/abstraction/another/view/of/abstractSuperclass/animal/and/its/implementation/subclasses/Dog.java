package lab7.polymorphism.abstraction.another.view.of.abstractSuperclass.animal.and.its.implementation.subclasses;

public class Dog extends Animal{
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }
    public void greeting(Dog another){
        System.out.println("Woooooooooof");
    }
}
