package lab9.oop.and.collections.framework.exercises.collections.phoneBook;

import java.util.ArrayList;

/**
 * A PhoneBook implementation internally using ArrayList. Slow!
 */
public class PhoneBookList implements PhoneBook {

    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        /* TODO */ phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        /* TODO */
        for (Student student : phoneBook) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        /* TODO */
        for (Student student : phoneBook) {
            if (student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        /* TODO */
        for (Student student : phoneBook) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        /* TODO */
       phoneBook.removeIf(student -> student.getPhone().equals(phone));


    }
}