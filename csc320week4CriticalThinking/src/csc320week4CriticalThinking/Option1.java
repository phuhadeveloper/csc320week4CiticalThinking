package csc320week4CriticalThinking;

/*
 * Pseudocode
 * 
 * SCANNER
 * USER_INPUT
 * TOTAL = 0
 * CURRENT_ITERATION = 0
 * NUM_OF_ITERATION
 * MAXIMUM = negative infinity
 * MINIMUM = positive infinity
 * AVERAGE
 * INTEREST_AT_20
 * 
 * WHILE (CURRENT_ITERATION < NUM_OF_ITERATION)
 * 	PRINT("Enter a number: ")
 * 	USER_INPUT = get user input from SCANNER
 * 	TOTAL += USER_INPUT
 * 	IF (CURRENT_INPUT > MAXIMUM) 
 * 		MAXIMUM = CURRENT_INPUT
 * 	IF (CURRENT_INPUT < MINIMUM)
 * 		MINIMUM = CURRENT_INPUT
 * 	CURRENT_ITERATION += 1
 * 
 * AVERAGE = TOTAL / NUM_OF_ITERATION
 * INTEREST_AT_20 = 0.2 * TOTAL
 * 
 * PRINT(AVERAGE, MAXIMUM, MINIMUM, INTEREST_AT_20)
 */


import java.util.Scanner;

public class Option1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double currentInput;
		double total = 0;
		double maximum = Double.NEGATIVE_INFINITY;
		double minimum = Double.POSITIVE_INFINITY;
		int numOfIteration = 5;
		int currentIteration = 0;
		double average;
		double interestAt20;
		
		System.out.println("Please enter 5 numbers.");
		while (currentIteration < numOfIteration) {
			System.out.print("Enter a number: ");
			currentInput = scanner.nextDouble();
			total += currentInput;
			
			if (currentInput > maximum) maximum = currentInput;
			if (currentInput < minimum) minimum = currentInput;
			
			currentIteration++;
		}
		
		average = total/numOfIteration;
		interestAt20 = total * 0.2;
		
		System.out.println("Average: " + average);
		System.out.println("Maximum: " + maximum);
		System.out.println("Minimum: " + minimum);
		System.out.println("Interest at 20%: " + interestAt20);
	}
	
}
