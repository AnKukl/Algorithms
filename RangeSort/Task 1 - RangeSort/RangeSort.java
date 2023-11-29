package Algorithms_TelRanPro.Homework.RangeSort;

public class RangeSort {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 9, 11, 24, 56, 57, 58, 59, 105,106,107};

        System.out.println(range(array));
    }

    public static String range(int[] array) {
        String strArr = new String();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[0]) strArr += array[i] + "-";
            if (array[i] == array[array.length - 1]) {
                strArr += array[i];
                break;
            }

            if (i >= 1) {

                if (array[i + 1] != array[i] + 1) {
                    strArr += array[i] + ",";
                } else if (array[i + 1] == array[i] + 1 && array[i - 1] != array[i] - 1) {
                    strArr += array[i] + "-";
                } else if (array[i + 1] == array[i] + 1 && array[i - 1] == array[i] - 1) {
                    continue;
                }
            }
        }

        return strArr;
    }


}
