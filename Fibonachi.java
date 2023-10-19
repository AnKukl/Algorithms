package Algorithms_TelRanPro;

public class Fibonachi {
// #1
// Чи́сла Фибоначчи — элементы числовой последовательности
//в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел


    public static void main(String[] args) {

        // #2
        System.out.println(FibonachiRecursionResearch(20));
        System.out.println("Количество рекурсивных операций: " + iterationCountRec);


        //#3
        System.out.println(FibonachiIterativeResearch(20));
        System.out.println("Количество итеративных операций: " + iterationCountIt);


        //#4
        cycle(10);
        System.out.println("Количество итеративных операций: " + iterationCountIt);
        System.out.println();
        cycle(20);
        System.out.println("Количество итеративных операций: " + iterationCountIt);
        System.out.println();
        cycle(30);
        System.out.println("Количество итеративных операций: " + iterationCountIt);
        System.out.println();


        FiboachiRecNumSeries(10);
        System.out.println("Количество рекурсивных операций: " + iterationCountRec);
        System.out.println();
        FiboachiRecNumSeries(20);
        System.out.println("Количество рекурсивных операций: " + iterationCountRec);
        System.out.println();
        FiboachiRecNumSeries(30);
        System.out.println();
        System.out.println("Количество рекурсивных операций: " + iterationCountRec);

        //#5
        // Можно сделать вывод, что в случае с числами Фибоначчи в целях экономии памяти лучше использовать итеративный подход;

    }

    private static int iterationCountRec = 0;
    private static long iterationCountIt = 0;

    public static int FibonachiRecursionResearch(int n) {
        iterationCountRec++;
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return FibonachiRecursionResearch(n - 1) + FibonachiRecursionResearch(n - 2);
        }
    }

    public static int FiboachiRecNumSeries(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            iterationCountRec++;
            result = FibonachiRecursionResearch(i);
            System.out.print(result + ", ");
        }
        return result;
    }

    public static int FibonachiIterativeResearch(int n) {

        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int previousNumber = 0;
        int currentNumber = 1;

        for (int i = 2; i <= n; i++) {
            iterationCountIt++;
            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
        return currentNumber;
    }

    public static int cycle(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            iterationCountIt++;
            result = FibonachiIterativeResearch(i);
            System.out.print(result + ", ");
        }
        return result;

    }

}


