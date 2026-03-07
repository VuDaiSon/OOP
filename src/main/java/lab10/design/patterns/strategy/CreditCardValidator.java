package lab10.design.patterns.strategy;


/**
 * Check credit card validity using Luhn algorithm.
 */
public class CreditCardValidator {

    public static boolean isValid(String number) {

        int sum = 0;
        boolean alternate = false;

        for (int i = number.length() - 1; i >= 0; i--) {

            int n = Integer.parseInt(number.substring(i, i + 1));

            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }

            sum += n;
            alternate = !alternate;
        }

        return (sum % 10 == 0);
    }
}