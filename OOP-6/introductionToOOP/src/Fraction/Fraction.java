package Fraction;
public class Fraction {
    private int integer;  // целая часть
    private int numerator;  //числитель
    private int denominator; // знаменатель
    // Encapsulation:
    public int getInteger() {
        return integer;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setInteger(int integer) {
        this.integer = integer;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        if (denominator == 0) denominator = 1;
        this.denominator = denominator;
    }
    ///////////////////////////////////////////////////////////////////
    //                   Constructors:
    public Fraction() {
        setDenominator(1); // конструктор по умолчанию
        System.out.println("1 DefaultConstructor:" + this.hashCode());
    }//Integer.toHexString(this.hashCode())
    public Fraction(int integer) {
        setInteger(integer);
        setNumerator(0);
        setDenominator(1);
        System.out.println("2 1ArgConstructor:\t" + this.hashCode());
    }
    public Fraction(int numerator, int denominator) {
        setInteger(0);
        setNumerator(numerator);
        setDenominator(denominator);
        System.out.println("3 Constructor:\t\t" + hashCode());
    }
    public Fraction(int integer, int numerator, int denominator) {
        setInteger(integer);
        setNumerator(numerator);
        setDenominator(denominator);
        System.out.println("4 Constructor:\t\t" + hashCode());
    }
    public Fraction(Fraction other) { // конструктор копирования
        this.integer = other.integer;
        this.numerator = other.numerator;
        this.denominator = other.denominator;
        System.out.println("5 CopyConstructor:\t" + hashCode());
    }
    //////////////////////////////////////////////////////////////
     //               Arithmetics: methods
//====================================================================================================
    public static Fraction add(Fraction left,Fraction right){
        return new Fraction(
                left.integer+right.integer,
                left.numerator*right.denominator+right.numerator* left.denominator,
                left.denominator*right.denominator
        ).toProper();
    }

    public static Fraction sub(Fraction l_value,Fraction r_value){
        Fraction left = new Fraction(l_value);// объекты останутся не изменными
        Fraction right = new Fraction(r_value);
        left.toImproper(); //A: 2(3/4) = 3+2*4=11 11/4
        right.toImproper();
        return new Fraction(left.numerator-right.numerator,
        left.numerator*right.denominator-right.numerator*left.denominator,
        left.denominator*right.denominator).toProper();
    }


    // Multiplication - умножение
    public static Fraction mul(Fraction l_value,Fraction r_value){ //A: 2(3/4); B: 3(4/5)
        Fraction left = new Fraction(l_value);// объекты останутся не изменными
        Fraction right = new Fraction(r_value);
        left.toImproper(); //A: 2(3/4) = 3+2*4=11 11/4
        right.toImproper();//B: 3(4/5) = 4+3*5=19 19/5
        /*Fraction result = new Fraction();
        result.setNumerator(left.numerator* right.numerator);//A 11 * B 19
        result.setDenominator(left.denominator* right.denominator); //A 4 * B 5
        result.toProper(); //преобразуем в прав дробъ! 209/20 = 10(9/20)
        return result; //10(9/20)*/
        //Создаем временный безымянный объект и сразу же возвращаем его на место вызова
        //Временный безымянный объект существует только в пределах одного выражения
        return new Fraction
                (
                left.numerator* right.numerator,
                left.denominator* right.denominator
                 ).toProper();
    }
                    // Division - деление
    /*public static Fraction div(Fraction l_value,Fraction r_value){
       Fraction left = new Fraction(l_value);
       Fraction right = new Fraction(r_value);
       left.toImproper();
       right.toImproper();
       return new Fraction(
               left.numerator*right.denominator,
                       right.numerator* left.denominator
       ).toProper();
    }*/
    public static Fraction div(Fraction l_value,Fraction r_value){

        return Fraction.mul(l_value,r_value.inverted());
    }

//==========================================================================================================
    ////////////////////////////////////////////////////////////////
    //                 Methods:
    Fraction inverted(){
        Fraction inverted = new Fraction(this);
        inverted.toImproper();
        int buffer = inverted.numerator;
        inverted.numerator = inverted.denominator;
        inverted.denominator = buffer;
        return inverted;
    }

    Fraction toImproper(){ // из дроби делаем неправильную дробь
numerator += integer*denominator; //2(3/4) = 3+2*4
        integer = 0;
        return this; //возвращаем измененный оъект
    }
    Fraction toProper(){
      integer+=numerator/denominator;
      numerator%=denominator;
      return this;
    }
//----------------------------------------------------------------------------------
    void print() { //МЕТОД ВЫВОДА НА ЭКРАН
        if (integer != 0) System.out.print(integer);
        if (numerator != 0) {
            if (integer != 0) System.out.print("(");
            System.out.print(numerator + "/" + denominator);
            if (integer != 0) System.out.print(")");
        } else if (integer == 0) System.out.print(0);
        System.out.println();
    }
 }


