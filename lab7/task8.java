import java.util.Random;

public class Task8 {
    public static void main(String[] args) {

        double[][] A = new double[12][6];

        Random rand = new Random();

        System.out.println("A массиві:");

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = rand.nextDouble() * 20 - 10;
                System.out.printf("%.2f ", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nБаған бойынша теріс элементтердің көбейтіндісі:");

        for (int j = 0; j < 6; j++) {
            double product = 1;

            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    product *= A[i][j];
                }
            }

            System.out.println("Баған " + j + ": " + product);
        }
    }
}
