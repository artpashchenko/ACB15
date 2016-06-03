package week222.day1;
/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 28.05.16
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends Employee {

    private Employee[] employees;

    public Manager(int age, String name, String surname, Employee[] employees) {
        super(age, name, surname);
        this.employees = employees;
    }

    @Override
    public void work() {
        System.out.println("I make people work");

        /*for (Coder coder : coders) {
            coder.work();
        }
        for (QA tester : testers) {
            tester.work();
        }*/

        for (Employee employee : employees) {
            if(employee != null) {
                employee.work();
                if(employee instanceof Coder){
                    Coder tmp = (Coder)employee;
                    tmp.writeCode();
                }
            }


        }

    }
}