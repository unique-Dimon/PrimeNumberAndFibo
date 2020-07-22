
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner n = new Scanner(System.in);
        int nth = n.nextInt();
        int num = 1;// будет нашим простым числом
        int counter = 0;
        int i;
        if (nth < 1) {
            System.out.println("This number is not exist");
        } else {
            while (counter < nth) {
                num++;//начнем проверять с 2
                for (i = 2; i <= num; i++) {
                    if (num % i == 0) {
                        break;
                    }
                }
                if (i == num) {
                    counter++;//если число простое увеличиваем счетчик
                }
            }
            System.out.println("Value of " + counter + "th simple number is: " + num);
        }
    }

}
