import java.util.Random;

public class Task16 {

    public static int maxX() {
        int[] array = new int[10];
        Random rand = new Random();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + " ");

            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("\nМаксимал элемент: " + maxX());
    }
}