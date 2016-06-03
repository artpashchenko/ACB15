package week222.MyArrayList;


/**
 * Created by IntelliJ IDEA.
 * User: Артем
 * Date: 01.06.16
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */
public class MyArrayList {

    private final int DEF_SIZE = 0;
    private Object[] array;

    public MyArrayList() {
        this.array = new Object[DEF_SIZE];
    }

    public MyArrayList(Object[] objects) {
        this.array = new Object[objects.length];
        System.arraycopy(objects, 0, array, 0, objects.length);
    }

    public MyArrayList(int size) {

        this.array = new Object[size];

    }

    public int size() {
        return this.array.length;

    }

    public void add(Object object) {
        Object[] tmpArray = new Object[size() + 1];
        System.arraycopy(array, 0, tmpArray, 0, size());
        tmpArray[size()] = object;
        this.array = tmpArray;
    }

    public void add(int index, Object object) {
        if (index < 0 || index > this.array.length) {
        } else {
            Object[] tmpArray = new Object[size() + 1];
            System.arraycopy(array, 0, tmpArray, 0, index);
            tmpArray[index] = object;
            System.arraycopy(array, index, tmpArray, index + 1, size() - 1);
            this.array = tmpArray;
        }
    }

    public Object get(int index) {
        return this.array[index];
    }

    public Object remove(int index) {
        Object oldIndex = array[index];
        Object[] tmpArray = new Object[size() - 1];
        System.arraycopy(array, 0, tmpArray, 0, index);
        System.arraycopy(array, index + 1, tmpArray, index, size() - 1 - index);
        this.array = tmpArray;
        return oldIndex;
    }

    public boolean remove(Object object) {
        for (int i = 0; i <= size(); i++) {
            if (object.equals(get(i))) {
                remove(i);
                return true;
            }
        }
        return false;
    }


}
