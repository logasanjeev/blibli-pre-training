import java.util.Arrays;
import java.util.Objects;

public class MyGenericList<T> {
    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 100;

    public MyGenericList() {
        this.array = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(T value) {
        if(size == array.length) grow();
        array[size++] = value;
    }

    public T get(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (T) array[index];
    }

    public void deleteByIndex(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        for(int i = index; i < size - 1; i++) {
            array[i] = array[i+1];
        }

        size--;
        array[size] = null;

        if(size > INITIAL_CAPACITY && size <= array.length / 4) shrink();
    }

    public boolean deleteByValue(T value) {
        for(int i = 0; i < size; i++) {
            if(Objects.equals(array[i], value)) {
                deleteByIndex(i);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    private void grow() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }

    private void shrink() {
        int newCapacity = Math.max(INITIAL_CAPACITY, array.length / 2);
        if(newCapacity < array.length) {
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;

        MyGenericList<?> other = (MyGenericList<?>) obj;

        if(this.size != other.size) return false;

        for(int i = 0; i < this.size; i++) {
            if(!Objects.equals(this.array[i], other.array[i])) return false;
        }

        return true;
    }
}
