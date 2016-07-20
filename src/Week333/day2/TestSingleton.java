package Week333.day2;

/**
 * Created by Артем on 05.06.2016.
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton s2ingleton = Singleton.getInstance();
    }
}
