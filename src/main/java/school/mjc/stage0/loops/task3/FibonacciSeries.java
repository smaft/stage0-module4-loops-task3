package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNumber = 0;
		int secondNumber = 1;
		int fibonacci ;

		System.out.println(firstNumber );
		System.out.println(secondNumber );

		for (int i = 2; i < lastFibonacci; i++) {

			fibonacci = firstNumber + secondNumber;
			System.out.println(fibonacci );

			firstNumber = secondNumber;
			secondNumber = fibonacci;
        }
    }
}