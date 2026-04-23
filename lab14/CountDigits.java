import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int n = sc.nextInt();

        int count = 0;
        do {
            n /= 10;
            count++;
        } while (n != 0);

        System.out.println("Цифр саны: " + count);
    }
}