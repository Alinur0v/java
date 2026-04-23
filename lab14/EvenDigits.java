import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int n = sc.nextInt();

        int count = 0;
        do {
            if ((n % 10) % 2 == 0) count++;
            n /= 10;
        } while (n > 0);

        System.out.println("Жұп цифрлар саны: " + count);
    }
}
