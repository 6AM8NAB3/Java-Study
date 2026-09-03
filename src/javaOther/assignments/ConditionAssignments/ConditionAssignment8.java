package javaOther.assignments.ConditionAssignments;

public class ConditionAssignment8 {
    public static void main(String[] args) {
        int menu = 3;

        String menuName = switch (menu) {
            case 1 -> "아메리카노";
            case 2 -> "카페라떼";
            case 3 -> "초코라떼";
            case 4 -> "녹차";

            default -> "없는 메뉴입니다.";
        };
        System.out.printf("선택한 메뉴: %s", menuName);
    }
}