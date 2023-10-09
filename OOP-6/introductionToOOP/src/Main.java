
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Hello world!");
        
        int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point(); // Объявление пременной 'A' типа 'Point'
        A.setX(2);               //создание объекта (экземпляра) 'А' класса 'Point'
        A.setY(3);

//        System.out.println("X = "+ A.x);
//        System.out.println("Y = "+ A.y);
        //Object

        Point B = new Point(); // создаем объект B
        B.setX(7);
        B.setY(8);
//        System.out.println("X = "+ B.x);
//        System.out.println("Y = "+ B.y);
        System.out.println("A и B = %.2f".formatted(Point.distanc(A,B)));
        Point C;
        C = new Point();
        C.print();

        Point D = new Point(5);
        D.print();

        Point E = new Point(22,33);
        E.print();
        System.out.println(E);

        Point G = new Point(E);
        System.out.println(G);
    }
}

class Point {
   private double x;
    private double y;
    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}
///////////////////////////////////////////////////////////////////////////////////////////////////
    //          Constructors:

    public Point(){System.out.println("DefaultConstructor:\t "+ this.hashCode());}


    public Point(double x){
    setX(x);
    System.out.println("1ArgConstructor:\t" + this.hashCode());

}
public  Point(double x, double y){
    setX(x);
    setY(y);
    System.out.println("Constructor:\t\t"+this.hashCode());
}
public Point(Point other){  //Конструктор копирования
    this.x = other.x;
    this.y = other.y;
    System.out.println("CopyConstructor: \t"+Integer.toHexString(this.hashCode()));
}

////////////////////////////////////////////////////////////////////////////////////////////////////

    //          Methods:


    public static double distanc(Point A,Point B){
    return Math.sqrt(Math.pow(A.x-B.x,2)+Math.pow(A.y-B.y,2));
}
    public void print(){System.out.println("X = %.2f и Y = %.2f".formatted(x,y));}
    public String toString(){return " toString X = %.3f ; Y = %.3f".formatted(x,y);}
}