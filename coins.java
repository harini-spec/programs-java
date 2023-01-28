import java.util.Arrays;
import java.util.Scanner;

public class coins {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of denominations: ");
		int n = sc.nextInt();
		int[] value = new int[n];
		int[] coins = new int[n];
		System.out.print("\nEnter the denominations: ");
		for(int i=0;i<n;i++) {
			value[i] = sc.nextInt();
			coins[i] = 0;
		}
		
		Arrays.sort(value);
		System.out.print("\nPlease enter the change amount: ");
		int change = sc.nextInt();
		int ind = n-1;
		while(change>0) {
			if(change>=value[ind]) {
			int count = change/value[ind];
			change = change%value[ind];
			coins[ind] = count;
			ind=ind-1;
			}
			else {
				ind = ind-1;
			}
		}
		
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.printf("%-4d",value[i]);
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.printf("%-4d",coins[i]);
		
	}
}
