package Week333.day2;

/**
 * Created by Артем on 05.06.2016.
 */
public class Singleton {

    public static volatile Singleton INSTANCE;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }

        }

        return INSTANCE;
    }
}
