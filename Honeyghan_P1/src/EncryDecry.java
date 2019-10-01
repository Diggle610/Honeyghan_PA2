import java.util.Scanner;
public class EncryDecry {
	public static int encrypted(int n) {

		int j =  n / 1000;
		int k = (n % 1000) / 100;
		int l = (n % 100) / 10;
		int m = n % 10;
		
		j = (j + 7) % 10;
		k = (k + 7) % 10;
		l = (l + 7) % 10;
		m = (m + 7) % 10;
		
		return (l * 1000 + m * 100 + j*10 + k);
	}
	 public static int decrypted(int n) {


		  int a = n / 1000;

		  int b = (n % 1000) / 100;

		  int c = (n % 100) / 10;

		  int d = n % 10;
		 
		  
		  a = (a + 3) % 10;

		  b = (b + 3) % 10; 

		  c = (c + 3) % 10;

		  d = (d + 3) % 10;

		  return (c * 1000 + d * 100 + a * 10 + b);

	 }

	
			 public static void main(String[] args) {
			  Scanner scnr = new Scanner(System.in);

			  int n;
			  System.out.println("Enter the four digit number: ");

			  (n) = scnr.nextInt();

			  System.out.println("The encrypted number is: " + encrypted(n));
			  System.out.println("Number after decryption is: " + decrypted(n));

			 }


}
	
