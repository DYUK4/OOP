package Fraction;

public class Main {
    public static void main(String[] args) {

        /*Fraction A = new Fraction();
        A.print();
        System.out.println(A.getDenominator());

        Fraction B = new Fraction(5);
        B.print();

        Fraction C = new Fraction(1,2);
        C.print();
        Fraction D = new Fraction(2,3,4);
        D.print();
        Fraction E = new Fraction(D);
        E.print();
        Fraction A1 = new Fraction(2,3, 5);
        A1.print();
        Fraction B2 = new Fraction(3,4,5);
        B2.print();
*/

        Fraction A = new Fraction(2,3,4);
        Fraction B = new Fraction(3,4,5);

        Fraction Ad = Fraction.add(A,B);
        A.print();
        B.print();
        Ad.print();
        Fraction SU = Fraction.sub(A,B);
        A.print();
        B.print();
        SU.print();
        Fraction Mu = Fraction.mul(A,B);
        A.print();
        B.print();
        Mu.print();
        Fraction Di = Fraction.div(A,B);
        A.print();
        B.print();
        Di.print();


    }
}
