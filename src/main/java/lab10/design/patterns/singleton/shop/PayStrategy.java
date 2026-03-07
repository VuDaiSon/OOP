package lab10.design.patterns.singleton.shop;


/**
 * Common interface for all strategies.
 */
public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}