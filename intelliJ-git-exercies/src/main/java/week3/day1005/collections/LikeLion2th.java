package week3.day1005.collections;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();
    private Names names=new Names();
    public LikeLion2th(){
        this.students=names.name();
        this.studentObjs=names.getStudentObjs();
    }
    public List<String> getStudentList() {
        return this.students;
    }
    public List<Student> getStudentObjs(){
        return this.studentObjs;
    }
    public int getSize(){
        return students.size();
    }
}
