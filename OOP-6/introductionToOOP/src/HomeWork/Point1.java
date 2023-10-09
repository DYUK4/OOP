package HomeWork;
import java.util.Scanner;
public class Point1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите координаты A по x и y: ");
        Pon ponA = new Pon();
        double ax = input.nextDouble();
        double ay = input.nextDouble();
        ponA.setX(ax);
        ponA.setY(ay);
        ponA.print();
        System.out.print("Введите координаты B точки по x и y: ");
        Pon ponB = new Pon();
        double bx = input.nextDouble();
        double by = input.nextDouble();
        ponB.setX(bx);
        ponB.setY(by);
        ponB.print();
        System.out.println("Расстояние от точки 'A' до точки 'B': %.2f".formatted(Pon.distance(ponA,ponB)));
    }
}
class Pon {
    private double x;
    private double y;
    public double detX() {return x;}
    public double getY() {return y;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public static double distance(Pon A, Pon B) {
      return Math.sqrt(Math.pow(A.x - B.x,2)+Math.pow(A.y-B.y,2));
    }
    public void print(){System.out.println("X = %.2f ; Y = %.2f".formatted(x,y));}
}