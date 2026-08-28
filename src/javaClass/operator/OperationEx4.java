package javaClass.operator;

public class OperationEx4 {
    public static void main(String[] args) {

        int fatherAge = 45;
        int motherAge = 47;

        char ch1;
        ch1 = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println(ch1);

        char ch2;
        if (fatherAge > motherAge){
            ch2 = 'T';
            System.out.println(ch2);
        }else {
            ch2 = 'F';
            System.out.println(ch2);
        }
    }
}
