import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        double[][] B = new double[5][5];
        double[] A = new double[5];

        Random rand = new Random();

        System.out.println("B массиві:");

        for (int i = 0; i < 5; i++) {
            double sum = 0;

            for (int j = 0; j < 5; j++) {
                B[i][j] = rand.nextDouble() * 20 - 10;
                System.out.printf("%.2f ", B[i][j]);

                if (B[i][j] > 0) {
                    sum += B[i][j];
                }
            }

            A[i] = sum;
            System.out.println();
        }

        System.out.println("\nA массиві:");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%.2f ", A[i]);
        }
    }
}