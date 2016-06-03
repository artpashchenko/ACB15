package week111.day2.Student;

import utils.MyDate;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.05.16
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
public class TDD {
    public static void main(String[] args) {

        Group group = new Group("ACO");

        Student st1 = new Student("Alex",
                new MyDate(1989, 12, 12),
                'M');

        boolean expected = true;
        boolean actual = group.addStudent(st1);

        System.out.printf("Method name - %s, result - %s," +
                " expected - %s, actual - %s\n", "addStudent"
                , expected == actual, expected, actual);

        boolean expected1 = true;
        boolean actual1 = group.delStudent(st1);

        System.out.printf("Method name - %s, result - %s," +
                " expected - %s, actual - %s\n", "delStudent"
                , expected1 == actual1, expected1, actual1);





    }
}