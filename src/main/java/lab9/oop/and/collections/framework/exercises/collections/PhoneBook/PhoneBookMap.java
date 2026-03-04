package lab9.oop.and.collections.framework.exercises.collections.PhoneBook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {

    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        // TODO
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student s) {
        // TODO
        phoneBook.put(s.getPhone(), s);
    }

    @Override
    public Student searchByName(String name) {
        // TODO
        for(Student s : phoneBook.values()){
            if(s.getName().equals(name)){
                return s;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        // TODO
        for(Student s : phoneBook.values()){
            if(s.getLastname().equals(lastname)){
                return s;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        // TODO
        return phoneBook.get(phone);
    }

    @Override
    public void deleteByNumber(String phone) {
        // TODO
        phoneBook.remove(phone);
    }
}