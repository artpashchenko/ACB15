package week222.day2.overloading;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 29.05.16
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
public abstract class Fighter {
    public int health = 100;
    private String name;
    public int damage;


    public String getName() {
        return name;
    }

    public abstract void hit(Fighter fighter);

    public int getHealth() {
        return health;
    }

   /* public  static asString(String name){
        return this.name;
    }*/
}
