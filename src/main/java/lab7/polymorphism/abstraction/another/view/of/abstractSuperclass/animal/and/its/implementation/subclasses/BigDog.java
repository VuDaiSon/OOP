package lab7.polymorphism.abstraction.another.view.of.abstractSuperclass.animal.and.its.implementation.subclasses;

public class BigDog extends Dog{
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }
    public void greeting(BigDog another){
        System.out.println("Wooooooooow!");
    }
}
