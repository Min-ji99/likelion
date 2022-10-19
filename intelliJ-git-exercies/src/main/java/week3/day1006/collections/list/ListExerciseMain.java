package week3.day1006.collections.list;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students=listExercise.getStudents();
        for(String student : students){
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
