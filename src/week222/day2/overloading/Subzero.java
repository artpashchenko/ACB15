package week222.day2.overloading;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 29.05.16
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class Subzero extends Fighter{
    
    public int extraDamage;

    /*public Subzero(String name; int damage) {
        super();
        this.extraDamage = extraDamage;
    }*/

    @Override
    public void hit(Fighter fighter) {
        fighter.getHealth();
    }
}
