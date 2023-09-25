package BianarySearch;

import java.util.Arrays;

public class HW_070923 {

    public static String InitElm(int[] arr1, int[] arr2, int k) {
        int index1 = 0;
        int index2 = 0;

        int[] result = new int[arr1.length + arr2.length];

        while (index1 < arr1.length) {
            result[index1] = arr1[index1];
            index1 += 1;
        }
        while (index2 < arr2.length) {
            result[arr1.length + index2] = arr2[index2];
            index2 += 1;
        }
  
        Arrays.sort(result);

        if (k < result.length) {
            System.out.println("Элемент с индесом " + k + ": " + result[k]);
        } else {
            System.out.println("Введите корректную позицию элемента");
        }

        return Arrays.toString(result);

    }


    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 256, 445, 892};

        System.out.println((HW_070923.InitElm(arr1, arr2, 3)));
    }
}