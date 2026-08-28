package javaOther.bookExamples;
// p.37

public class CastingExample2 {
    public static void main(String[] args) {
        int a = 10;
        //byte b = a; -> 컴파일 오류 발생 (더 작은 범위로 변환해서)
        byte b = (byte)a;
    }
}
