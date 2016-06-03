package week222.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 28.05.16
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 */
public class QA extends Employee{
    private int extraMoney;

    public QA(int age, String name, String surname, int extraMoney) {
        super(age, name, surname);
        this.extraMoney = extraMoney;
    }

    public String asString(){
        return String.format("%s, bonus - %d", super.asString(), extraMoney);
    }

    @Override
    public void work(){
        System.out.println("I'm testing");
    }
}