package lab10.design.patterns.adapter.payment;

public class OnlineStore {

    public void checkout(PaymentProcessor processor, int amount) {
        processor.pay(amount);
    }
}