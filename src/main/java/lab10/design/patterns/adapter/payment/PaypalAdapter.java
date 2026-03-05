package lab10.design.patterns.adapter.payment;

public class PaypalAdapter implements PaymentProcessor {

    private PaypalService service;

    public PaypalAdapter(PaypalService service) {
        // TODO
        this.service = service;
    }

    @Override
    public void pay(int amount) {
        // TODO
        service.sendPayment(amount);
    }
}