package Algorithms_TelRanPro.Lessons.AmortizedAnalysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        MyArrayList mal = new MyArrayList();

        int n = 100;
        for (int i = 0; i < n; i++) {
            mal.append(i);
        }
        System.out.println(mal);
        System.out.println(mal.getPosition(4));
        mal.remove(5);
        System.out.println(mal);

    }


    static class MyArrayList {

        private int[] storage;
        private int index;

        public MyArrayList() {
            this.storage = new int[2];
            this.index = 0;
        }

        public int getIndex() {
            return this.index;
        }

        public void append(int item) {
            int n = this.storage.length;

            if (n == this.index) {
                int[] temp = new int[2 * n];
                for (int i = 0; i < n; i++) {
                    temp[i] = this.storage[i];
                }
                this.storage = temp;
                System.out.println("n == this.index" + this.index);
            }

            this.storage[this.index] = item;
            this.index++;

        }

        public int getPosition(int element) {
            int[] array = this.storage;
            int n = array.length;
            for (int i = 0; i < n; i++) {
                if (element == array[i]) {
                    return i;
                }
            }
            return 0;
        }

        public void remove(int position) {
            int n = this.storage.length - 1;
            int[] array = new int[n];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (position != i){
                    array[index] = this.storage[i];
                    index++;
                }else {
                    i++;
                    array[index] = this.storage[i];
                    index++;
                }

            }
            this.storage = array;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");
            for (int i = 0; i < this.index; i++) {
                sb.append(String.format("%d ", this.storage[i]));
            }
            sb.append("]");

            return sb.toString();
        }
    }
}

//      >> n+1
//    public void append(int item) {
//            int[] temp = new int[this.array.length + 1];
//
//            for (int i = 0; i < this.array.length; i++) {
//                temp[i] = this.array[i];
//            }
//
//            temp[temp.length - 1] = item;
//            this.count++;
//            this.array = temp;
//        }


//                  Амортизационный анализ(метод агрегаций)
//
//