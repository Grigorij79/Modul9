import java.util.Arrays;

public class MyArrayList {
    private Object [] elements;

    private int size;

    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList(){
        this.elements = new Object [DEFAULT_CAPACITY];
    }
    public MyArrayList(int initialCapacity){
        if (initialCapacity >= 0){
            this.elements = new Object [initialCapacity];
        }
        else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }
    public void clear() {
       final Object[] es = elements;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }
    public Object get(int index){
        isIndexExist(index);
        return elements[index];
    }
    private int isIndexExist(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }

        return index;
    }
    public int size (){
        return size;
    }
    public boolean add(Object value){
        if (size == elements.length){
            elements = increaseCapacity();
        }
        elements[size] = value;
        size++;
        return true;
    }
    public Object remove (int index){
        isIndexExist(index);
        Object [] temp = elements;
        elements = new Object [temp.length-1];
        Object value = temp[index];
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
        size--;
        return value;
    }

    private Object [] increaseCapacity(){
        Object [] temp = new Object[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }
    @Override
    public String toString(){
        Object [] temp = new Object[size];
        System.arraycopy(elements, 0, temp, 0, size);
        return Arrays.toString(temp);
    }


}
