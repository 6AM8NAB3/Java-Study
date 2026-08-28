package javaClass.loop;

public class breakEx {
    public static void main(String[] args) {

        // 0부터 1씩 늘리며 숫자의 합이 100초과시 그 수와 합 구하기
        int i = 0;
        int total = 0;

        for(;; i++) {
            total += i;

            if (total > 100) {
                break;
            }
        }
        System.out.printf("num: %d\ntotal: %d", i, total);
    }
}
