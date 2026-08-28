package javaOther.bookExamples;
// p.33

public class IntegerExample2 {
    public static void main(String[] args) {

        int a = 2147483647;
        int b = 1;
        int c = a + b;

        System.out.println(c); // -> 표현할 수 있는 수의 범위에서 초과되어 범위의 최솟값이 출력된다
    }
}
