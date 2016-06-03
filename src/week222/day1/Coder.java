package week222.day1;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 28.05.16
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class Coder extends Employee{
    private  String programmingLanguage;

    public Coder(int age, String name, String surname, String programmingLanguage) {

        super(age, name, surname);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("I'm making art");
    }

    public void writeCode(){
        System.out.println("codding");
    }

    public String asString(){
        return String.format("%s, language - %s", super.asString(), programmingLanguage);
    }
}
