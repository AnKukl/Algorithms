package Algorithms_TelRanPro.Homework;

public class DivideAndRule {

    public static void main(String[] args) {
        int[] arr1 = {19,26,34,42,52,64,71,80};
        int[] arr2 = {23,24,27,34,56,75,90};
        System.out.println(InitElm(arr1, arr2, 8));
    }

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
