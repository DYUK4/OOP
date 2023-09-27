

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        
        int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point(); // Объявление пременной 'A' типа 'Point'
        A.x = 2;               //создание объекта (экземпляра) 'А' класса 'Point'
        A.y = 3;
        System.out.println("X = "+ A.x);
        System.out.println("Y = "+ A.y);
        //Object
    }
}

class Point {

    double x;
    double y;

}