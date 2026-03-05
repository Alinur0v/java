import java.util.Random;

public class Task13 {
    public static void main(String[] args) {

        int[] C = new int[20];
        Random rand = new Random();

        int sum = 0;

        for (int i = 0; i < 20; i++) {
            C[i] = rand.nextInt(50);
            System.out.print(C[i] + " ");
            sum += C[i];
        }

        double average = (double) sum / 20;

        System.out.println("\nОрташа мәні: " + average);
    }
}