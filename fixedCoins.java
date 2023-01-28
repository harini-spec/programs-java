import java.util.Arrays;
import java.util.Scanner;

public class fixedCoins {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of denominations: ");
		int n = sc.nextInt();
		int[] value = new int[n];
		int[] res = new int[n];
		int[] coins = new int[n];
		
		System.out.print("\nEnter the denominations: ");
		for(int i=0;i<n;i++) {
			value[i] = sc.nextInt();
			res[i] = 0;
		}
		
		System.out.print("\nEnter the number of coins available for each denomination: ");
		for(int i=0;i<n;i++) {
			coins[i] = sc.nextInt();
		}
		
		Arrays.sort(value);
		System.out.print("\nPlease enter the change amount: ");
		int change = sc.nextInt();
		int ind = n-1;
		while(change>0) {
			if(change>=value[ind]) {
				int count = change/value[ind];
				if(count<=coins[ind]) {
					res[ind] = count;
					change = change%value[ind];
				}
				else{
					res[ind] = coins[ind];
					change = change-coins[ind]*value[ind];
				}
								
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
			System.out.printf("%-4d",res[i]);
		
	}
}
