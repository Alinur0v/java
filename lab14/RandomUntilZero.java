import java.util.Random;

public class RandomUntilZero {
    public static void main(String[] args) {
        Random rand = new Random();
        int num;

        do {
            num = rand.nextInt(10); // 0-9
            System.out.println(num);
        } while (num != 0);
    }
}
