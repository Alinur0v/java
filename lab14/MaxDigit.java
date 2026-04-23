import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int n = sc.nextInt();

        int max = 0;
        do {
            int digit = n % 10;
            if (digit > max) max = digit;
            n /= 10;
        } while (n > 0);

        System.out.println("Ең үлкен цифр: " + max);
    }
}
