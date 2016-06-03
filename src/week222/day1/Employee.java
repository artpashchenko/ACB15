package week222.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 28.05.16
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private int age;
    private String name;
    private String surname;

    public Employee() {
    }

    public Employee(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public String asString(){
        return  String.format("Name - %s, surname - %s, age - %d",
                name, surname, age);
    }

    public void work(){
        System.out.println("I'm working (Employee)");
    }


}