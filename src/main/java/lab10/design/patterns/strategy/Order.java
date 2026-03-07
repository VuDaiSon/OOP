package lab10.design.patterns.strategy;



public class Order {

    private int totalCost = 0;
    private boolean isClosed = false;
    private PayStrategy strategy;
    public void setStrategy(PayStrategy strategy){
this.strategy = strategy;
    }
    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
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