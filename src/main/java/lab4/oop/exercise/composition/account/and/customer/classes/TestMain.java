package lab4.oop.exercise.composition.account.and.customer.classes;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(2, "Vu Dai Son", 'm');
        System.out.println(customer1);
        Account account1 = new Account(1, customer1, 1000000);
        Customer proletariat1 = new Customer(0, "proletariat", 'g');
        Account proletariat = new Account(0, proletariat1);
        System.out.println("Vu Dai Son handsome id: " + account1.getID());
        System.out.println("Vu Dai Son handsome balance: " + account1.getBalance());
        System.out.println("Vu Dai Son gave proletariat 10$: " + proletariat.deposit(10));
        System.out.println("The account1's owner is: " + account1.getCustomerName());
        System.out.println("Vu Dai Son balance after giving 10$ for proletariat: " + account1.withdraw(10));
    }
}
