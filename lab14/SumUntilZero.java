import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Сан енгізіңіз (0 - тоқтау): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Қосынды: " + sum);
    }
}
