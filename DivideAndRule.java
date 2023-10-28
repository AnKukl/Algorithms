package Algorithms_TelRanPro.Homework;

import java.util.Arrays;

public class DivideAndRule {

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        System.out.println(InitElm(arr1, arr2, 7));
        int[] arr = {56, 72, 3, 4, 15, 709, 23, 58};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    //Сортировка слиянием:
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }


    //Поиск элемента на позиции k:
    public static int InitElm(int[] arr1, int[] arr2, int k) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int index1 = 0;
        int index2 = 0;

        while (index1 < length1 && index2 < length2) {
            if (arr1[index1] < arr2[index2]) {
                if (index1 + index2 == k) {
                    return arr1[index1];
                }
                index1++;
            } else {
                if (index1 + index2 == k) {
                    return arr2[index2];
                }
                index2++;
            }
        }
        return -1;


    }
}
