
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Hello world!");
        
        int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point(); // Объявление пременной 'A' типа 'Point'
        A.x = 2;               //создание объекта (экземпляра) 'А' класса 'Point'
        A.y = 3;

        System.out.println("X = "+ A.x);
        System.out.println("Y = "+ A.y);
        //Object

        Point B = new Point(); // создаем объект B
        B.x = 4;
        B.y = 5;
        System.out.println("X = "+ B.x);
        System.out.println("Y = "+ B.y);

    }
}

class Point {

    double x;
    double y;

}