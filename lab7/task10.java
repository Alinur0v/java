import java.util.Random;

public class Task10 {
    public static void main(String[] args) {

        double[][] D = new double[7][7];
        double sum = 0;

        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = rand.nextDouble() * 20;
                System.out.printf("%.2f ", D[i][j]);

                if (i == j) {
                    sum += D[i][j];
                }
            }
            System.out.println();
        }

        double average = sum / 7;

        System.out.println("Диагональдың арифметикалық ортасы: " + average);
    }
}