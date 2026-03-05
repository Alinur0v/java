import java.util.Random;

public class Task11 {
    public static void main(String[] args) {

        int[] A = new int[25];
        Random rand = new Random();

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < 25; i++) {
            A[i] = rand.nextInt(100);
            System.out.print(A[i] + " ");

            if (A[i] < A[minIndex]) minIndex = i;
            if (A[i] > A[maxIndex]) maxIndex = i;
        }

        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        System.out.println("\nАуыстырылған массив:");

        for (int i = 0; i < 25; i++) {
            System.out.print(A[i] + " ");
        }
    }
}