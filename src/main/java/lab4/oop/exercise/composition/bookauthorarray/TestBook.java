package lab4.oop.exercise.composition.bookauthorarray;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@gmail.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@gmail.com", 'm');
        Book javaDummy = new Book("Java for dummy", authors, 19.99, 9);
        System.out.println(javaDummy);
    }
}
