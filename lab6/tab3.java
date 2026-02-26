import java.util.Scanner;

public class tag3 {
    public static double f(double x) {
        if (x>-4 && x<=5) {
            return Math.cbrt(Math.pow(x,2)+3)+6*Math.pow(x,2);
        } else if (x>0) {
            return Math.pow(x,5)+3.5;
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