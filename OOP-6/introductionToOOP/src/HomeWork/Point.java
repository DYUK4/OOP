package HomeWork;
import java.util.Scanner;
public class Point {

    private double Ax;
    public double getAx() {
        return Ax;
    }
    public void setAx(double Ax) {
        this.Ax = Ax;
    }
//============================================================
    private double Ay;
    public double getAy() {
        return Ay;
    }
    public void setAy(double Ay) {
        this.Ay = Ay;
    }
 //============================================================
    private double Bx;
    public double getBx() {
        return Bx;
    }
    public void setBx(double Bx) {
        this.Bx = Bx;
    }
 //============================================================
    private double By;
    public double getBy() {
        return By;
    }
    public void setBy(double By) {
        this.By = By;
    }
}
class distAB{
    public static void main(String[] args) {
        String seporate = "====================================================";
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координаты двух точек A и B :");
        System.out.print("Введите А по x: ");
        Point dis = new Point();
        double Ax = input.nextDouble();
        dis.setAx(Ax);
        System.out.print("Введите А по y: ");
        double Ay = input.nextDouble();
        dis.setAy(Ay);
        System.out.println(seporate);
        System.out.print("Введите B по x: ");
        double Bx = input.nextDouble();
        dis.setBx(Bx);
        System.out.print("Введите B по y: ");
        double By = input.nextDouble();
        dis.setBy(By);
        System.out.println(seporate);
//==========================================
        double disX = Ax - Bx;
        double disY = Ay - By;

        System.out.println("Расстояние между точкой А:%.2f:%.2f и точкой B:%.2f:%.2f = %.3f "
                .formatted(dis.getAx(),dis.getAy(),dis.getBx(),dis.getBy(),Math.sqrt(disX*disX+disY*disY)));
        System.out.println(seporate);
    }
}