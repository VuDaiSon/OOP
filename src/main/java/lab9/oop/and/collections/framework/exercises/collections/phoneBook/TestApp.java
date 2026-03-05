package lab9.oop.and.collections.framework.exercises.collections.phoneBook;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();
        pb.addPerson(new Student("Nicola", "Amen", "123123"));
        pb.addPerson(new Student("Sern", "Voo", "123123"));
        pb.addPerson(new Student("Amaw", "Goege", "321332"));
        System.out.println(pb.searchByLastname("Sern"));
        System.out.println(pb.searchByLastname("Goege"));
        System.out.println(pb.searchByNumber("123123"));
        pb.deleteByNumber("123123");
        System.out.println(pb.searchByLastname("Amen"));
    }
}
