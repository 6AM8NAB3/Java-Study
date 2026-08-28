package javaOther.assignments.OperationAssignments;

public class OperationAssignment5 {
    public static void main(String[] args) {
        int x = 17;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("%d는 %s입니다.", x, result);
    }
}
