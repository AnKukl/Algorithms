package Algorithms_TelRanPro.Homework.TaskGetMin;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) throws Exception {
        System.out.println();
        SpecialStack specialStack = new SpecialStack();
        for (int i = 1; i < 100; i++) {
            specialStack.push(i);
        }
        System.out.println(specialStack);
        System.out.println(specialStack.isEmpty());
        System.out.println();

        System.out.println(specialStack.getMin());
        System.out.println();

        System.out.println(specialStack.pop());
        System.out.println(specialStack);
        for (int i = 0; i < 10; i++) {
            specialStack.pop();
        }
        System.out.println(specialStack);


    }
}
