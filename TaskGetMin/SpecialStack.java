package Algorithms_TelRanPro.Homework.TaskGetMin;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SpecialStack {
    private int[] storage = new int[1];
    private int index = 0;
    private int count = 0;

    public void push(int element) {
        if (this.count >= this.storage.length) grow();
        this.storage[index++] = element;
        this.count++;
    }

    public int pop() throws Exception {
        if (count != 0) {
            int result = storage[--index];
            this.storage[index] = 0;
            count--;
            return result;
        } else throw new Exception("Stack is empty");
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public int getMin() throws Exception {
        if (!isEmpty()) {
            int result = storage[0];
            for (int i = 0; i < count; i++) {
                if (storage[i] <= result) {
                    result = storage[i];
                }
            }
            return result;
        } else {
            throw new Exception("Stack is empty!");
        }
    }

    public void grow() {
        this.storage = Arrays.copyOf(this.storage, storage.length * 2);
    }


    @Override
    public String toString() {
        int[] newStorage = new int[count];
        for (int i = 0; i < count; i++) {
            newStorage[i] = storage[i];
        }
        return Arrays.toString(newStorage);
    }
}
