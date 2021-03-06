package week111.day2.Student;

import utils.MyDate;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 22.05.16
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */

public class Student implements Comparable{

    private String name;

    private MyDate birthDay;

    private double averageMark;
    private char gender;

    public Student(String name, MyDate birthDay, char gender) {
        this.birthDay = birthDay;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public char getGender() {
        return gender;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;

        if(!(o instanceof Student)) return false;

        Student tmp = (Student) o;

        return this.name.equals(tmp.name) && this.birthDay.equals(tmp.birthDay);

    }

    public String toString(){
        return String.format("%2$s, BD - %1$s, average mark - %3$.1f",  birthDay.asString(), name, averageMark);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if(o != null && o instanceof Student) {
            Student tmp = (Student)o;

            return this.name.compareTo(tmp.name);
        }

        return -1;
    }
//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
}