package lab10.design.patterns.singleton.shop;


public class Order {
    private static Order instance;

    private int totalCost = 0;
    private boolean isClosed = false;
    private Order(){
    }
public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
}
    public void processOrderByPaypal(PayByPaypal paypal) {
        paypal.collectPaymentDetails();
    }

    public void processOrderByCreditCard(PayByCreditCard creditCard) {
        creditCard.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}