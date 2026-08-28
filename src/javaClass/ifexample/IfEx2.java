package javaClass.ifexample;

public class IfEx2 {
    public static void main(String[] args) {

        int age = 9;
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("취학전 아동입니다.");
        }
        else if(age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다");
        }
        else {
            charge = 3000;
            System.out.println("일반인 입니다");
        }
        System.out.printf("입장료는 %d원입니다.",charge);
    }
}
