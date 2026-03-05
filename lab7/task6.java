import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        int[][] A = new int[10][10];
        int[] B = new int[10];

        Random rand = new Random();

        System.out.println("A массиві:");

        for (int i = 0; i < 10; i++) {
            int sum = 0;

            for (int j = 0; j < 10; j++) {
                A[i][j] = rand.nextInt(21) - 10;
                System.out.print(A[i][j] + " ");

                if (A[i][j] < 0) {
                    sum += A[i][j];
                }
            }

            B[i] = sum;
            System.out.println();
        }

        System.out.println("\nB массиві (теріс элементтердің қосындысы):");

        for (int i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
    }
}