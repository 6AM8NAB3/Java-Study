package javaClass.loop;

public class whileEx2 {
    public static void main(String[] args) {

        int i = 0;
        int total = 0;

        while(i < 11) {
            total += i;
            i++;
        }

        System.out.println(total);
    }
}
