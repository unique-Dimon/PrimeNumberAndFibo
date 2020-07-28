import java.util.Scanner;
import java.math.BigInteger;

public class NthNumberFibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number Fibonacci: ");
        Scanner n = new Scanner(System.in);
        int nth = n.nextInt();
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int counter = 0;
        BigInteger i = BigInteger.ZERO;
        if (nth < 1) {
            System.out.println("This number not exist");
        } else {
            while (counter < nth) {
                counter++;
                if (counter != 1) {// When 1st number, we don't change i
                    i = a.add(b);
                    if (counter > 2) {// starting from 3rd number, rewrite the previous numbers
                        a = b;
                        b = i;
                    }
                }
            }
            System.out.println("Your Fibonacci is: " + i);
        }
    }
}