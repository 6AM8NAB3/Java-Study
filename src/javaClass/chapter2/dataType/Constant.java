package javaClass.chapter2.dataType;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100; //-> 상수 선언시 '_' 또는 대문자로 변수 이름을 선언함
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        //MAX_NUM = 1000; 오류 발생 -> 값 변경 안됨
    }
}
