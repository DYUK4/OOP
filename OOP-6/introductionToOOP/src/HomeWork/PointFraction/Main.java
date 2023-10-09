package HomeWork.PointFraction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Point A;
        System.out.println("Введите координаты двух точек A и B");
        System.out.print("Введите А по x и y: ");
        double Ax = scan.nextDouble();
        double Ay = scan.nextDouble();
        A = new Point(Ax, Ay); // обращене к конструктору
        System.out.println(A);

        Point B;
        System.out.print("Введите B по x и y: ");
        double Bx = scan.nextDouble();
        double By = scan.nextDouble();
        B = new Point(Bx, By);// обращене к конструктору
        System.out.println(B);
        System.out.println("Расстояние межу точками 'A' и 'B' = %.2f".formatted(Point.distanc(A,B)));

//==============================================================

        System.out.print("Введите целые числа: ");
        int fi = scan.nextInt();
        int fn = scan.nextInt();
        int fd = scan.nextInt();
        Fraction fr = new Fraction(fi,fn,fd);
        fr.prin();

    }
}
class Point {
    private double x;
    private double y;
    ///// Encapsulation:
    public double getX() {return x;}
    public double getY() {return y;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
///////////////////////////////////////////////////////////////////////////////////////////////////
              //Constructors:
    public Point() {
        System.out.println("DefaultConstructor 1 :\t " + this.hashCode());
    }
    public Point(double x) {
        setX(x);
        System.out.println("1ArgConstructor 2 :\t" + this.hashCode());
    }
    public Point(double x, double y) {
        setX(x);
        setY(y);
        System.out.println("Constructor 3 :\t\t" + this.hashCode());
    }
    public Point(Point other) {  //Конструктор копирования
        this.x = other.x;
        this.y = other.y;
        System.out.println("CopyConstructor 4 : \t" + Integer.toHexString(this.hashCode()));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
    //          Methods:
    public static double distanc(Point A, Point B) {
        return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));}
    public void print() {System.out.println("X = %.2f и Y = %.2f".formatted(x, y));}
    public String toString() { return "X = %.2f ; Y = %.2f".formatted(x, y);}
    }

