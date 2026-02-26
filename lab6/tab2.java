import java.util.Scanner;

public class tag2 {
    public static double f(double x) {
        if (x>=0 ) {
            return Math.sqrt(Math.pow(x , 3) + 5);
        } else if (x>-3 && x<0) {
            return 3 * Math.pow(x , 4) + 9;
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