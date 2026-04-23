import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N енгізіңіз: ");
        int n = sc.nextInt();

        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Қосынды: " + sum);
    }
}