package Example;

public class HW_310823 {


    public static int countNumberOfChars(String a, char b) {
        return CountNumberOfChars(a, b, 0);
    }

    private static int CountNumberOfChars(String a, char b, int index) {
        if (index >= a.length()) {
            return 0;
        }

        int count = (a.charAt(index) == b) ? 1 : 0;

        return count + CountNumberOfChars(a, b, index + 1);
    }

    public static void main(String[] args) {
        System.out.println("hello world , l ->" + countNumberOfChars("hello world", 'l'));
    }
}



