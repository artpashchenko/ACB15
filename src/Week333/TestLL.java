package Week333;

import java.util.List;

/**
 * Created by Артем on 18.06.2016.
 */
public class TestLL {
    public static void main(String[] args) {
        List list = new MyLinkedList();
        list.add(5);
        int expected =1;
        int actual = list.size();
        boolean result = expected == actual;
        System.out.printf("Method add, result %s, actual - %d, expected - %d\n", result , actual, expected);
    }
}
