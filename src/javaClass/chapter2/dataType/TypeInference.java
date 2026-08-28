package javaClass.chapter2.dataType;
//java ver.10 이상부터 서용 가능, 컴파일러가 추론하여 실행하지만 되도록 사용X

public class TypeInference {
    public static void main(String[] args) {

        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";

        //str = 3;
    }
}
