package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNumber = 0;
		int secondNumber = 1;
		int fibonacci = '\0';

		System.out.print(firstNumber + " ");
		System.out.print(secondNumber + " ");

		for (int i = 2; i < lastFibonacci; i++) {

			fibonacci = firstNumber + secondNumber;
			System.out.print(fibonacci + " ");

			firstNumber = secondNumber;
			secondNumber = fibonacci;
        }
    }
}