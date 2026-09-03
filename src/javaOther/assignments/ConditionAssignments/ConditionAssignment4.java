package javaOther.assignments.ConditionAssignments;

public class ConditionAssignment4 {
    public static void main(String[] args) {

        int dollar = 50, exchangeRate = 1400;
        int exchangeDollar = dollar * exchangeRate;


        if (dollar < 0)
            System.out.println("잘못된 금액입니다.");

        else if(dollar == 0)
            System.out.println("환전할 금액이 없습니다.");

        else
            System.out.printf("환전 금액은 %d원입니다.", exchangeDollar);

    }
}