
import java.util.Scanner;
public class Polling {
	static String [] q= {"First Question", "Second Question","Third Question","Fourth Question","Fifth Question"};
	
	static int [] [] ratings = new int [5][10];

	public static void main(String[] args) {
		
		double[] tally = new double [] {0,0,0,0,0};
		double averge = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("Give your rating between 1 - 10 for the isuue " + (j + 1) + ". " + q[j]);
			ratings [j][i] = scnr.nextInt();
				}
		}
		
		System.out.println("Replies");
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "." + q[i]);
			
			for (int j = 0; j < 10; j++) {
				System.out.println(ratings[i][j]);
				
				tally[i] = tally[i] + ratings[i][j];
				
			}
		averge = tally[i] / 10;
		
		System.out.println("Average = " + averge);
	}
	
		double max = tally[0], min = tally[0];
		
		int maxA = 0;
		int minA = 0;		
		
		for(int i = 0; i < 5; i++) {
			if(max < tally[i]) {
				max = tally[i];
				
				maxA = i;
			}
		
			if(min > tally [i]) {
				min = tally[i];
				
				minA = i;

			}
		}
		
		System.out.println("Maximum rated issue " + q[maxA] + " Ranking: " + max);
		System.out.println("Minimum rated issue " + q[minA] + " Ranking: " + min);
		// TODO Auto-generated method stub

	}

}
