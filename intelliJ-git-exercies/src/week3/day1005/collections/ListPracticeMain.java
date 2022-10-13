package week3.day1005.collections;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        //List<String> students = likeLion2th.getStudentList();
        List<Student> stuentObjs = likeLion2th.getStudentObjs();
        for (Student student : stuentObjs) {
            System.out.println(student);
        }
        System.out.println("list size : "+likeLion2th.getSize());
    }
}
