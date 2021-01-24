package Calculator;

import java.util.Scanner;

public class CalculatorTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two doubles");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		Calculator newCalculator = new Calculator();
		
		newCalculator.sum(x, y);
		newCalculator.divide(x, y);
		newCalculator.subtract(x, y);
		newCalculator.multiply(x, y);
		
		input.close();
		
		
	}

}
