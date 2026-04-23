import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, min = Integer.MAX_VALUE;

        do {
            System.out.print("Сан енгізіңіз (0 - тоқтау): ");
            num = sc.nextInt();
            if (num != 0 && num < min) {
                min = num;
            }
        } while (num != 0);

        System.out.println("Ең кіші сан: " + min);
    }
}