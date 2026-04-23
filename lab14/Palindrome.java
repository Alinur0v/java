import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;

        do {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        } while (n > 0);

        if (original == reversed)
            System.out.println("Палиндром");
        else
            System.out.println("Палиндром емес");
    }
}
