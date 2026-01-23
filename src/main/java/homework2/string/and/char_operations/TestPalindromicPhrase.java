package homework2.string.and.char_operations;

import java.util.Scanner;

/** A phrase that reads the same backward as forward is also called a palindrome, e.g., ”Madam,
 * I’m Adam”, ”A man, a plan, a canal - Panama!” (ignoring punctuation and capitalization).
 * Modify your methods (called isPalindromicPhrase() and testPalindromicPhrase())
 * to check for palindromic phrase.
 */
public class TestPalindromicPhrase {
    public static void main(String[] args) {
        testPalindromicPhrase();

    }
    public static boolean isPalindromicPhrase(String inStr){
        inStr = inStr.toLowerCase();
        int fIdx = 0;
        int bIdx = inStr.length() -1;
        while(fIdx < bIdx){
            while(fIdx < bIdx && !Character.isLetter(inStr.charAt(fIdx))){
                fIdx++;
            }
            while(fIdx < bIdx && !Character.isLetter(inStr.charAt(bIdx))){
                bIdx--;
            }
            if(inStr.charAt(fIdx) != inStr.charAt(bIdx)){
                return false;
            }
            fIdx++;
            bIdx--;
        }
        return true;
    }
    public static void testPalindromicPhrase() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();

        if (isPalindromicPhrase(phrase)) {
            System.out.println("\"" + phrase + "\" is a palindrome");
        } else {
            System.out.println("\"" + phrase + "\" is not a palindrome");
        }
    }
}
