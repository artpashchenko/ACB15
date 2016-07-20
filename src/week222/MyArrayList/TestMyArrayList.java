package week222.MyArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 03.06.16
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList testList = new MyArrayList();

        testList.add("1qwerty");
        testList.add("2qwqw");
        testList.add("3qwqw");
        testList.add("4qwqw");
        testList.add("5qwqw");
        testList.add("6qwqw");
        testList.add("7qwqw");

        System.out.println(testList);
        System.out.println(testList.get(2));

        testList.set(3,"wertu");
        System.out.println(testList.get(3));

        System.out.println(testList.toString());
    }
}
