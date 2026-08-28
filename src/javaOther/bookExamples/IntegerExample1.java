package javaOther.bookExamples;
// p.32

public class IntegerExample1 {
    public static void main(String[] args) {
        // int a = 2147483648 -> 컴파일 에러
        int a = 2147483647;

        System.out.println(a);
    }
}
