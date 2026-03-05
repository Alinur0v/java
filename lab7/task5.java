import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        double[] D = new double[17];
        double sum = 0;

        Random rand = new Random();

        System.out.println("Массив элементтері:");

        for (int i = 0; i < D.length; i++) {
            D[i] = rand.nextDouble() * 20;
            System.out.printf("%.2f ", D[i]);
            sum += D[i];
        }

        double average = sum / D.length;

        System.out.println("\nАрифметикалық орта: " + average);
    }
}