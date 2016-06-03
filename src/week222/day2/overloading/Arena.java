package week222.day2.overloading;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 29.05.16
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
public class Arena {

    private  Fighter first;
    private  Fighter second;

    public Arena(Fighter first, Fighter second){
        this.first = first;
        this.second = second;
    }

    public void startFight(){
        while (first.getHealth() > 0 && second.getHealth() >0){
            first.hit(second);
            if(second.getHealth() <=0){
               // System.out.println(first.asString + "win!");
            }
            second.hit(first);
            if(first.getHealth() <=0){
               // System.out.println(second.asString + "win!");
            }
        }
    }
}
