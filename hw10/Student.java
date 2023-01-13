import java.util.ArrayList;

public class Student {

    public void addAndPrintGrades() {
        ArrayList<Integer> grade = new ArrayList<>();
        grade.add(10);
        grade.add(20);
        grade.add(30);
        grade.add(40);
        grade.add(50);

        for (Integer col : grade) {
            System.out.println(col);
        }
    }
}