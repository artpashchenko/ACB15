package week111.day2.Student;

import utils.MyDate;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.05.16
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
public class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student("Alex",
                new MyDate(1989, 12, 12),
                'M');
        Student st2 = new Student("Johnny",
                new MyDate(1989, 12, 12),
                'M');
        Student st3 = new Student("Johnny",
                new MyDate(1989, 12, 12),
                'M');


        Student[] students = new Student[2];
        students[1] = st1;
        students[0] = st2;

       System.out.println(Arrays.toString(students));

        System.out.println(st1.equals(st2));

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println(st2);
        System.out.println(st3.compareTo(st2));

        /*  Group aco13 = new Group("ACO13");
            aco13.addStudent(st1);
            aco13.addStudent(st2);
            aco13.showGroup();
        */

//        System.out.println(st1.toString());
    }
}