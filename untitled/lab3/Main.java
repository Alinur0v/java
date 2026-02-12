import java.util.Scanner;

public class lab3 {

    static double f1(double x) {
        return Math.cbrt(Math.exp(x)) - Math.sin(Math.PI * x / (x + 2.0/3.0)) + 1.7;
    }
    static double f2(double x) {
        return Math.log(Math.abs(x - 1.5)) + Math.pow(x, 4.0/5.0) + Math.cbrt(Math.exp(3*x) + 4);
    }
    static double f3(double x) {
        return Math.tan(5*x/3.0) + Math.log(Math.abs(2*x + 5)) + 1.8;
    }
    static double f4(double x) {
        return Math.cos(5*x) + Math.tan(2 - Math.abs(x));
    }
    static double f5(double x) {
        return Math.pow(x, 5)*1.7 + Math.abs(x - 5);
    }
    static double f6(double x) {
        return x + (int)(x/2) + x % 5 + Math.exp(5 - x);
    }
    static double f7(double x) {
        return x % 6 + Math.pow(3*x, 1.0/5.0);
    }
    static double f8(double x) {
        return Math.sqrt(4 + 3*Math.pow(x, 4)) + Math.sin(4*x + Math.pow(x, 3));
    }
    static double f9(double x) {
        return Math.pow(Math.exp(3*x) + 7, 1.0/4.0) + Math.cos(x*x) + Math.log(Math.abs(3*x + 7));
    }
    static double f10(double x) {
        return Math.log(5*x) + Math.pow(x, 5)*Math.sin(Math.pow(x, 3)) + Math.tan(Math.pow(x, 4));
    }
    static double f11(double x) {
        return Math.tan(Math.sin(2*x) + Math.pow(x, 7) + Math.cbrt(Math.pow(2, x+3)));
    }
    static double f12(double x) {
        return Math.log(Math.abs(5*x + 3)) + Math.cos(Math.PI*Math.pow(x, 2)) + Math.tan(Math.pow(x, 3));
    }
    static double dist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
    static double[] rightTriangle(double a, double b) {
        double c = Math.sqrt(a*a + b*b);
        double S = 0.5 * a * b;
        return new double[]{c, S};
    }
    static double[] operations(double a, double b) {
        return new double[]{a+b, a-b, a*b};
    }
    static double eqTriangle(double a) {
        return (Math.sqrt(3)/4) * a * a;
    }
    static double[] triangleSecondCathet(double hyp, double cat) {
        double cat2 = Math.sqrt(hyp*hyp - cat*cat);
        double S = 0.5 * cat * cat2;
        double r = (cat + cat2 - hyp) / 2; // inradius
        double circleArea = Math.PI * r * r;
        return new double[]{cat2, circleArea};
    }
    static double height(double a, double b, double c) {
        double p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return (2*S)/a;
    }
    static double median(double a, double b, double c) {
        return 0.5*Math.sqrt(2*b*b + 2*c*c - a*a);
    }
    static double bisector(double a, double b, double c) {
        return (2*b*c*Math.cos(Math.acos((b*b + c*c - a*a)/(2*b*c))/2)) / (b + c);
    }
    static double[] inOutCircles(double a, double b, double c) {
        double p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        double r = S/p;           // inradius
        double R = a*b*c / (4*S); // circumradius
        return new double[]{r, R};
    }
    static double[] avg(double a, double b) {
        return new double[]{(a+b)/2, Math.sqrt(Math.abs(a)*Math.abs(b))};
    }
    static double[] mix(double t1, double v1, double t2, double v2) {
        double V = v1 + v2;
        double t = (t1*v1 + t2*v2) / V;
        return new double[]{t, V};
    }
    static double regularPolygon(double r, int n) {
        double side = 2*r*Math.sin(Math.PI/n);
        return n * side;
    }
    static double parallel(double r1, double r2, double r3) {
        return 1.0 / (1/r1 + 1/r2 + 1/r3);
    }
    static double fall(double h) {
        return Math.sqrt(2 * 9.8 * h);
    }
    static double[] cube(double a) {
        return new double[]{a*a*a, 6*a*a};
    }
    static double[] means(double x, double y) {
        return new double[]{(x+y)/2, Math.sqrt(x*y)};
    }
    static double formula26(double x, double y) {
        return (Math.abs(x)+Math.abs(y)) / (1 + Math.abs(x*y));
    }
    static double circleAreaFromLength(double L) {
        double r = L / (2*Math.PI);
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1–27 аралығында есеп таңдаңыз:");
        int n = sc.nextInt();
        double result;
        switch (n) {
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9: case 10:
            case 11: case 12:
                System.out.print("x енгізіңіз: ");
                double x = sc.nextDouble();

                result =
                        (n==1)? f1(x):
                                (n==2)? f2(x):
                                        (n==3)? f3(x):
                                                (n==4)? f4(x):
                                                        (n==5)? f5(x):
                                                                (n==6)? f6(x):
                                                                        (n==7)? f7(x):
                                                                                (n==8)? f8(x):
                                                                                        (n==9)? f9(x):
                                                                                                (n==10)? f10(x):
                                                                                                        (n==11)? f11(x):
                                                                                                                f12(x);

                System.out.println("Нәтиже: " + result);
                break;
            case 13:
                System.out.print("x1, y1, x2, y2: ");
                System.out.println("Distance = " + dist(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                break;
            case 14:
                System.out.print("a, b: ");
                double[] r14 = rightTriangle(sc.nextDouble(), sc.nextDouble());
                System.out.println("Гипотенуза = " + r14[0]);
                System.out.println("Аудан = " + r14[1]);
                break;

            case 15:
                System.out.print("a, b: ");
                double[] r15 = operations(sc.nextDouble(), sc.nextDouble());
                System.out.println("Қосынды = " + r15[0]);
                System.out.println("Айырма = " + r15[1]);
                System.out.println("Көбейтінді = " + r15[2]);
                break;

            case 16:
                System.out.print("a: ");
                System.out.println("Аудан = " + eqTriangle(sc.nextDouble()));
                break;

            case 17:
                System.out.print("Гипотенуза, катет: ");
                double[] r17 = triangleSecondCathet(sc.nextDouble(), sc.nextDouble());
                System.out.println("Екінші катет = " + r17[0]);
                System.out.println("Іштей сызылған шеңбер ауданы = " + r17[1]);
                break;

            case 18:
                System.out.print("a, b, c: ");
                double a18 = sc.nextDouble(), b18 = sc.nextDouble(), c18 = sc.nextDouble();
                System.out.println("Биіктік = " + height(a18, b18, c18));
                System.out.println("Медиана = " + median(a18, b18, c18));
                System.out.println("Биссектриса = " + bisector(a18, b18, c18));
                double[] r18 = inOutCircles(a18, b18, c18);
                System.out.println("Іштей шеңбер r = " + r18[0]);
                System.out.println("Сырттай шеңбер R = " + r18[1]);
                break;

            case 19:
                System.out.print("a, b: ");
                double[] r19 = avg(sc.nextDouble(), sc.nextDouble());
                System.out.println("Арифметикалық орта = " + r19[0]);
                System.out.println("Геометриялық орта = " + r19[1]);
                break;

            case 20:
                System.out.print("t1, v1, t2, v2: ");
                double[] r20 = mix(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                System.out.println("t = " + r20[0]);
                System.out.println("V = " + r20[1]);
                break;

            case 21:
                System.out.print("r, n: ");
                System.out.println("Периметр = " + regularPolygon(sc.nextDouble(), sc.nextInt()));
                break;

            case 22:
                System.out.print("r1, r2, r3: ");
                System.out.println("Параллель кедергі = " + parallel(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                break;

            case 23:
                System.out.print("h: ");
                System.out.println("Жылдамдық = " + fall(sc.nextDouble()));
                break;

            case 24:
                System.out.print("a: ");
                double[] r24 = cube(sc.nextDouble());
                System.out.println("Көлем = " + r24[0]);
                System.out.println("Аудан = " + r24[1]);
                break;

            case 25:
                System.out.print("x, y: ");
                double[] r25 = means(sc.nextDouble(), sc.nextDouble());
                System.out.println("Арифметикалық орта = " + r25[0]);
                System.out.println("Геометриялық орта = " + r25[1]);
                break;

            case 26:
                System.out.print("x, y: ");
                System.out.println("Нәтиже = " + formula26(sc.nextDouble(), sc.nextDouble()));
                break;

            case 27:
                System.out.print("Шеңбер ұзындығы L: ");
                System.out.println("Шеңбер ауданы = " + circleAreaFromLength(sc.nextDouble()));
                break;

            default:
                System.out.println("Қате! 1–27 арасын таңдаңыз.");
        }
    }
}