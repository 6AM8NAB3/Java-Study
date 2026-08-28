package javaClass.ifexample;

public class SwitchCaseEx2 {
    public static void main(String[] args) {
        String medal = "Gold";
        String message;

        message = switch (medal){
            case "Gold" -> "금메달 입니다";
            case "Silver" -> "은메달 입니다";
            case "Bronze" ->  "동메달 입니다";
            default -> "메달이 없어요";
        };

        System.out.println(message);
    }
}
