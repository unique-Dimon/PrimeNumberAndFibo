
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner n = new Scanner(System.in);
        int nth = n.nextInt();
        int num = 2;// will be our prime number
        int counter = 1;
        int i;
        if (nth < 1) System.out.println("This number is not exist");
        else {
            if (nth == 1) System.out.println("Value of 1th simple number is: " + num);
            else {
                while (counter < nth) {
                    num++;// checking with 3
                    for (i = 3; i <= num; i += 2) {
                        if (num % i == 0) {
                            break;
                        }
                    }
                    if (i == num) {// check: prime number or not
                        counter++;// when prime number, increase counter
                    }
                }
                System.out.println("Value of " + counter + "th simple number is: " + num);
            }
        }
    }
}
