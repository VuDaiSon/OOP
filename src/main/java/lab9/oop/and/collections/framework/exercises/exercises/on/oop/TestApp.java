package lab9.oop.and.collections.framework.exercises.exercises.on.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestApp {
    public static void main(String[] args) throws ParseException {
        Item i1 = new Book("Soff", 2002, 170);
        Item i2 = new Book("Moon", 2011, 130);
        Student s1 = new Student("Darrell", "Abbott", "0001");
        Student s2 = new Student("Vu", "Dai Son", "0002");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Rent[] rents = new Rent[2];
        rents[0] = new Rent(i1, s2, sdf.parse("15/06/2020"), sdf.parse("15/07/2021"));
        rents[1] = new Rent(i2, s1, sdf.parse("15/02/2002"), sdf.parse("20/02/2003"));
        Library l = new Library(rents);
        System.out.println(l.getLongestRent());
    }
}
