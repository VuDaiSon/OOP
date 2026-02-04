package lab4.oop.exercise.composition.bookauthor;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@gmail.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@gmail.com");
        System.out.println("name is: " +ahTeck.getName());
        System.out.println("email: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
