import java.util.Scanner;

public class tag5 {
    public static double f(double x) {
        if (x>0 && x<2) {
            return Math.pow(x,3)*Math.cos(x);
        } else if (x>=2 && x<=5) {
            return 3*Math.pow(x,4)+7;
        } else if (x>5 && x<=9) {
            return Math.sqrt(5*Math.pow(x,2)+1.6);
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