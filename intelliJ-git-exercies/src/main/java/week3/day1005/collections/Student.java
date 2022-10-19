package week3.day1005.collections;

public class Student {
    private String name;
    private int classNo;
    private String gitRepositoryAddress;

    public Student(int classNo, String name, String gitRepositoryAddress){
        this.classNo=classNo;
        this.name=name;
        this.gitRepositoryAddress=gitRepositoryAddress;
    }
}
