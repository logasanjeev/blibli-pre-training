import java.util.Arrays;

public class MyList {
    private int[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 100;

    public MyList() {
        this.array = new int[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(int value) {
        if(size == array.length) grow();
        array[size++] = value;
    }

    public int get(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return array[index];
    }

    public void deleteByIndex(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        for(int i = index; i < size - 1; i++) {
            array[i] = array[i+1];
        }

        size--;
        array[size] = 0;

        if(size > INITIAL_CAPACITY && size <= array.length / 4) shrink();
    }

    public boolean deleteByValue(int value) {
        for(int i = 0; i < size; i++) {
            if(array[i] == value) {
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

        MyList other = (MyList) obj;

        if(this.size != other.size) return false;

        for(int i = 0; i < this.size; i++) {
            if(this.array[i] != other.array[i]) return false;
        }

        return true;
    }
}
