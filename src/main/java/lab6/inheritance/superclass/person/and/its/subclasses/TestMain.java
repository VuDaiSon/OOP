package lab6.inheritance.superclass.person.and.its.subclasses;

public class TestMain {
    public static void main(String[] args) {
        Person p1 = new Person("An", "Hanoi");
        Student s1 = new Student("Binh", "HCM", "CS", 2, 1500);
        Staff st1 = new Staff("Lan", "Danang", "FPT", 2000);
        Person s2 = new Student("Antony", "LA", "cs", 2, 2000);
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(st1);
        System.out.println(s2);
    }
}
