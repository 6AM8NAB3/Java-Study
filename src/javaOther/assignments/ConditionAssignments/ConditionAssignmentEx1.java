package javaOther.assignments.ConditionAssignments;

public class ConditionAssignmentEx1 {
    public static void main(String[] args) {

        int price = 35000, age = 17;

        if (price >= 30000)
            price -= 3000;

        if (age <= 18)
            price -= 2000;

        System.out.print(price);
    }
}
