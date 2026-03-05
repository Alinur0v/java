import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        double[] C = new double[25];
        double product = 1;

        Random rand = new Random();

        System.out.println("Массив элементтері:");

        for (int i = 0; i < C.length; i++) {
            C[i] = rand.nextDouble() * 20 - 10; // -10 мен 10 аралығы
            System.out.printf("%.2f ", C[i]);

            if (C[i] > 0) {
                product *= C[i];
            }
        }

        System.out.println("\nОң элементтердің көбейтіндісі: " + product);
    }
}