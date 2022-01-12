package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        ArrayList<Integer> student1grades = new ArrayList<>(Arrays.asList(10, 20, 40));
        ArrayList<Integer> student2grades = new ArrayList<>(Arrays.asList(20, 40, 60));
        ArrayList<Integer> student3grades = new ArrayList<>(Arrays.asList(30, 60, 120));
        ArrayList<Integer> student4grades = new ArrayList<>(Arrays.asList(40, 80, 160));

        Student student1 = new Student("Bronze", student1grades);
        Student student2 = new Student("Silver", student2grades);
        Student student3 = new Student("Platinum", student3grades);
        Student student4 = new Student("Diamond", student4grades);

        students.put("Sam09", student1);
        students.put("Sammy2000", student2);
        students.put("Samuel3000", student3);
        students.put("SamIAm", student4);

        System.out.println(students);


    }
}
