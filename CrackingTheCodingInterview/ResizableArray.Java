import java.util.*;

public class ResizableArray<E> {
    /** Default initial capacity of underlying array **/
    final private int _initialCapacity = 10;
    /** Underlying array **/
    private Object[] items;
    /** Current number of elements **/
    private int size;

    /** Create a ResizableArray with a default initial capacity. **/
    public ResizableArray() {
        this.items = new Object[_initialCapacity];
        this.size = 0;
    }

    /** Create a ResizableArray with a specific initial capacity.
        @param capacity The initial capacity for the underlying array.
    **/
    public ResizableArray(int capacity) {
        this.items = new Object[capacity];
        this.size = 0;
    }

    /** Add an element to the end of the array (will automatically resize if current capacity is reached). **/
    public void append(E element) {
        ensureExtraCapacity();

        items[size] = element;
        size++;
    }

    /** Check if the array has enough capacity to append a value; if the array is full, doubles the underlying array. **/
    public void ensureExtraCapacity() {
        if(size == items.length) {
            Object[] copy = new Object[size << 1];
            System.arraycopy(items, 0, copy, 0, size);
            items = copy;
        }
    }

    /** @param index An index for an element currently stored in the ResizableArray.
        @return The element located at index.
    **/
    public Object get(int index) {
        checkBounds(index);

        return items[index];
    }

    /** Overwrite the value at some index.
        @param index The index to be set.
        @param value The value to be set.
    **/
    public void set(int index, E value) {
        checkBounds(index);
        items[index] = value;
    }

    /** Check if insertion index is valid.
        @throws ArrayIndexOutOfBoundsException if index is negative or larger than the current size.
    **/
    public void checkBounds(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    /** Print the contents of the array. **/
    public void print() {

        System.out.print("[");

        if(size > 0) {
            for(int i = 0; i < size - 1; i++) {
                System.out.print(items[i] + ", ");
            }
            System.out.print(items[size - 1]);
        }

        System.out.println("]");
    }

    /** Print the contents of the array.
        @param name The array name to precede the array contents.
    **/
    public void print(String name) {
        System.out.print(name + ": ");
        print();
    }
}
