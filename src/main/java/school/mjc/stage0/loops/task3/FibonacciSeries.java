package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int currentNumber = 0;
        int previousNumber = 0;
        int temp;
        for (int i = 0; i < lastFibonacci; i++) {
            if (i == 0) {
                currentNumber = i;
            } else if (i == 1) {
                currentNumber = 1;
                previousNumber = 0;
            } else {
                temp = currentNumber + previousNumber;
                previousNumber = currentNumber;
                currentNumber = temp;
            }
            System.out.println(currentNumber);
        }
    }
}
