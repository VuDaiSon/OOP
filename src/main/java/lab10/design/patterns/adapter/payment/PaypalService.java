package lab10.design.patterns.adapter.payment;

public class PaypalService {

    public void sendPayment(int money) {
        System.out.println("Paid " + money + " using Paypal");
    }
}