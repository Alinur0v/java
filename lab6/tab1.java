import java.util.Scanner;

public class tab1 {
    public static double f(double x) {
        if (x > -2 && x < 5) {
            return 5 * Math.pow(x, 2) + 6;
        } else if (x >= 5) {
            return Math.pow(x, 3) + 7;
        } else {
            throw new IllegalArgumentException("x мәні анықталу облысына кірмейді");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();
        System.out.println("f(x) = " + f(x));
    }
}