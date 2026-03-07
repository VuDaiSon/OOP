package lab10.design.patterns.singleton.shop;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Console e-commerce application.
 */
public class App {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();

    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    private static Order order = Order.getInstance();
    private static PayStrategy strategy;

    static {

        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {

        while (!order.isClosed()) {

            int cost;
            String continueChoice;

            do {

                System.out.println("Please select a product:");
                System.out.println("1 - Motherboard");
                System.out.println("2 - CPU");
                System.out.println("3 - HDD");
                System.out.println("4 - Memory");

                int choice = Integer.parseInt(reader.readLine());

                cost = priceOnProducts.get(choice);

                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());

                order.setTotalCost(cost * count);

                System.out.print("Continue shopping? (Y/N): ");
                continueChoice = reader.readLine();

            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {

                System.out.println("Select payment method:");
                System.out.println("1 - Paypal");
                System.out.println("2 - Credit Card");

                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new PayByPaypal();
                    order.processOrderByPaypal((PayByPaypal) strategy);
                } else {
                    strategy = new PayByCreditCard();
                    order.processOrderByCreditCard((PayByCreditCard) strategy);
                }
            }

            System.out.print("Pay " + order.getTotalCost() + " or Continue shopping? (P/C): ");
            String proceed = reader.readLine();

            if (proceed.equalsIgnoreCase("P")) {

                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment successful.");
                } else {
                    System.out.println("Payment failed!");
                }

                order.setClosed();
            }
        }
    }
}