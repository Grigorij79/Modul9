import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class MyQueue  {
   private Object [] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyQueue(){
        this.elements = new Object [DEFAULT_CAPACITY];
    }
    public MyQueue(int initialCapacity){
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


    public Object peec(){
       return elements[0];
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

    public Object poll (){
         Object [] temp = elements;
        elements = new Object [temp.length-1];
        Object value = temp[0];

        System.arraycopy(temp,  1, elements, 0, temp.length  - 1);
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
