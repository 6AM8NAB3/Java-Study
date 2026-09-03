package javaOther.assignments.LoopAssignments;

public class LoopAssignment6 {
    public static void main(String[] args) {

        for(int i = 1; i < 10; i++){
            if(i % 2 == 0){
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
            }
        }
    }
}
