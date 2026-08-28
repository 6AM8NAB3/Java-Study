package javaClass.ifexample;

public class SwitchCaseEx3 {
    public static void main(String[] args) {
        int month = 2;

        int day = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                System.out.println("가장 짧은 달 입니다");
                yield 28;
            }
            case 4, 6, 9, 11 -> 30;

            default -> {
                System.out.println("없는 달 입니다");
                yield 0;
            }
        };

        System.out.printf("%d월은 총 %d일 입니다.", month, day);
    }
}
