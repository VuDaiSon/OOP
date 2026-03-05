package lab10.design.patterns.adapter.payment;

public class Test {
    public static void main(String[] args) {
        OnlineStore onlineStore = new OnlineStore();
        PaypalService paypalService = new PaypalService();
        PaymentProcessor paymentProcessor = new PaypalAdapter(paypalService);
        onlineStore.checkout(paymentProcessor, 20);
    }
}
