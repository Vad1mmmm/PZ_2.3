package pz_2_3_2_my_array_list;
public class MyArrayList {
    private Box[] array;
    private int size = 0;

    public MyArrayList() {
        array = new Box[10];
    }

    public MyArrayList(int capacity) {
        array = new Box[capacity];
    }

    public void add(Box box) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size] = box;
        size++;
    }

    public void add(int index, Box box) {
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = box;
        size++;
    }

    public void addAll(Box[] boxes) {
        for (int i = 0; i < boxes.length; i++) {
            add(boxes[i]);
        }
    }

    public void addAll(int index, Box[] boxes) {
        ensureCapacity(size + boxes.length);
        for (int i = size - 1; i >= index; i--) {
            array[i + boxes.length] = array[i];
        }
        for (int i = 0; i < boxes.length; i++) {
            array[index + i] = boxes[i];
        }
        size += boxes.length;

    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = array.length;
            while (newCapacity < minCapacity) {
                newCapacity *= 2;
            }

            Box[] newArray = new Box[newCapacity];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    private void increaseCapacity() {
        Box[] newArray = new Box[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public Box get(int index) {
        return array[index];
    }

    public Box remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Box removed = array[index];

        for (int j = index; j < size - 1; j++) {
            array[j] = array[j + 1];
        }

        size--;
        array[size] = null;

        if (size <= array.length / 2 && array.length > 1) {
            Box[] newArray = new Box[array.length / 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        return removed;
    }
    public void set(int index, Box box) {
        array[index] = box;
    }
    public int size() {
        return size;
    }
}



