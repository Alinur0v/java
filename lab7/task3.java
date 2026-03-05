import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        double[] A = new double[12];
        double product = 1;

        Random rand = new Random();

        System.out.println("Массив элементтері:");

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextDouble() * 20 - 10; // -10 мен 10 аралығында
            System.out.printf("%.2f ", A[i]);

            if (A[i] < 0) {
                product *= A[i];
            }
        }

        System.out.println("\nТеріс элементтердің көбейтіндісі: " + product);
    }
}