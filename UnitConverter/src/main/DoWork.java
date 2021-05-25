package main;

import java.util.Scanner;

public class DoWork {
	Scanner scanner = new Scanner(System.in);
	int menuSelection = 0;
	double degreeInput = 0;
	double milesInput = 0;
	double gallonsInput = 0;
	public void doStuff() {
		while (menuSelection != 4) {
			System.out.println("Please select an option:" +
				"\n\n1. Degrees Farenheit to Degrees Celsius" + "\n2. Miles to Kilometers" + 
				"\n3. US Gallons to Liters" + "\n4. Quit");
		
		
		menuSelection = scanner.nextInt();
		
		switch (menuSelection) {
		case 1:
			convertDegrees();
			break;
			
		case 2:
			convertDistance();
			break;
			
		case 3:
			convertGallons();
			break;
		}
		if (menuSelection == 4) {
			System.out.println("Goodbye");
		}
		
		}
		scanner.close();
	}
	
	public void convertDegrees() {
		double degreeCelsius = 0;
		System.out.println("Please enter the degrees Farenheit");
		
		degreeInput = scanner.nextDouble();
		//System.out.println(degreeInput);
		degreeCelsius = (degreeInput - 32) * 5/9;
		System.out.println("The degrees in Celsius is: " + degreeCelsius);
		
	}
	
	public void convertDistance() {
		double km = 0;
		System.out.println("Please enter the number of miles you wish to convert");
		milesInput = scanner.nextDouble();
		km = milesInput * 1.609;
		System.out.println("The number of kilometers is: " + km);
	}
	
	public void convertGallons() {
		double liters = 0;
		System.out.println("Please enter the number of gallons");
		gallonsInput = scanner.nextDouble();
		liters = gallonsInput * 3.785;
		System.out.println("The number of liters is: " + liters);
	}
}
