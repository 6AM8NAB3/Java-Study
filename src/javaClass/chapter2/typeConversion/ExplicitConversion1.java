package javaClass.chapter2.typeConversion;

public class ExplicitConversion1 {
    public static void main(String[] args) {

        byte value6 = (byte)128; //-> -128이 출력됨
        System.out.println(value6);

        int value7 = (int)3.5;
        System.out.println(value7);

        float value8 = (float)7.5; // -> double 에서 float
        System.out.println(value8);
    }
}
