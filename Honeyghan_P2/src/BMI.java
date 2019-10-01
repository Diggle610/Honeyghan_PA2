import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		float weight;
		float height;
		float bMI;
		int f;
		
		
		System.out.println("Choose the formula");
		System.out.println("1. BMI = (703 * weight In Pounds / height In Inches ^ 2)");
		System.out.println("2. BMI = (BMI = (weight In Kilograms / height In Meters ^ 2)");
		System.out.println("Input your choice (1/2)");
		
		f = scnr.nextInt();
		
		if (f == 1) {
			System.out.println("Enter your weight in pounds: ");
			
			weight = scnr.nextFloat();
			
			System.out.println("Enter your height in inches: ");
			
			height = scnr.nextFloat();
			
			bMI = (weight * 703) / (height * height);
			
			System.out.printf("Your body mass index (BMI) is %f",bMI);;
		}
		
		else
		{
			System.out.println("Enter your weight in Kilograms: ");
	         
			weight = scnr.nextFloat();
			
			System.out.println("Enter your height in Inches: ");
			
			height = scnr.nextFloat();
			
			bMI = (weight) / (height * height);
			System.out.printf("Your Body Mass Index (BMI) is %f", bMI);
		}
		
	System.out.println(" BMI Ranks");
	System.out.println("Underweight: < 18.5");
	System.out.println("Normal: between 18.5 and 24.9");
	System.out.println("Overweight: between 25 and 29.9");
	System.out.println("Obese: 30 or greater");
			
		}
		// TODO Auto-generated method stub

	}