package javaClass.loop;

public class forEx1 {
    public static void main(String[] args) {

        int num;
        int total = 0;

        for(num = 1; num <= 5; num++) {
            total += num;
        }

        System.out.println(total);
    }
}
