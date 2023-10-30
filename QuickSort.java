package Algorithms_TelRanPro.Homework;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 53, 3, 22, 35, 4, 56, 43, 45, 78, 52, 86};
        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quicksort(int[] arr, int left, int right) {
        int mid = arr[(left + right) / 2];
        int l = left;
        int r = right;
        while (l <= r) {
            while (arr[l] < mid) {
                l++;
            }
            while (arr[r] > mid) {
                r--;
            }

            if (l <= r) {
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++;
                r--;
            }
        }
        if (l < right) {
            quicksort(arr, l, right);
        }
        if (r > left) {
            quicksort(arr, left, r);
        }

    }


}
