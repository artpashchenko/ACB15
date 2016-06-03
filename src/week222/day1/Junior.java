package week222.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 28.05.16
 * Time: 17:11
 * To change this template use File | Settings | File Templates.
 */
public class Junior extends Coder {


    public Junior(int age, String name, String surname, String programmingLanguage) {
        super(age, name, surname, programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I'm only trying to make art");
    }
}