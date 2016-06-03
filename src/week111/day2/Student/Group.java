package week111.day2.Student;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.05.16
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 */
public class Group {
    private static final int GROUP_SIZE = 20;
    private int counter;
    private String name;
    private Student[] students;

    public Group(String name) {
        this.name = name;
        this.students = new Student[GROUP_SIZE];
    }

    public Group(String name, int groupSize) {
        this.name = name;
        this.students = new Student[groupSize];
    }

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public boolean addStudent(Student student){
        if(student == null) return false;
        if(counter >= students.length) return false;

//               todo check if already present in group

        students[counter] = student;
        counter++;
        return true;
    }

    public void showGroup(){
        for (int i = 0; i < counter; i++) {
            System.out.println(students[i].toString());
        }
    }

    public Student search(String name){
        return null;
    }

    public boolean delStudent(Student student){
        return false;
    }


}
