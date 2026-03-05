import java.util.Random;
import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {

        int[] B = new int[25];
        Random rand = new Random();

        for (int i = 0; i < 25; i++) {
            B[i] = rand.nextInt(100);
        }

        System.out.println("Бастапқы массив:");
        System.out.println(Arrays.toString(B));

        Arrays.sort(B);

        System.out.println("Сұрыпталған массив:");
        System.out.println(Arrays.toString(B));
    }
}