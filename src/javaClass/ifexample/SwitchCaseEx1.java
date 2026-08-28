package javaClass.ifexample;

public class SwitchCaseEx1 {
    public static void main(String[] args) {

        int ranking = 4;
        char medalColor = 'N';

        switch(ranking) {
            case 1: medalColor = 'G';
            break;

            case 2: medalColor = 'S';
            break;

            case 3: medalColor = 'B';
            break;

            default:
                System.out.println("메달이 없어요");
        }

        System.out.println(medalColor);
    }
}
