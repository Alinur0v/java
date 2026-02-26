import java.util.Scanner;

public class tag4 {
    public static double f(double x) {
        if (x<1.22) {
            return x*Math.cos(x);
        } else if (x>=1.22) {
            return 5*Math.pow(x,3)+1.7;
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