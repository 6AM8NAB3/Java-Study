package javaClass.loop;

public class whileEx3 {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        do {
            total += i;
            i++;
        } while(i < 11);

        System.out.println(total);
    }
}
