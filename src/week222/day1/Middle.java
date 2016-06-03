package week222.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 28.05.16
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */
public class Middle extends Coder {


    public Middle(int age, String name, String surname, String programmingLanguage) {
        super(age, name, surname, programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I can make art better than junior");
    }
}
