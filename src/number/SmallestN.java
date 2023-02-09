package number;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SmallestN {

	public static void main(String[] args) {
		 Random rand = new Random();
		    int[] numbers = new int[500];
		    for (int i = 0; i < 500; i++) {
		      numbers[i] = rand.nextInt(1000) + 1;
		    }
		    
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the nth smallest number you want to find: ");
		    int n = sc.nextInt();
		    
		    Arrays.sort(numbers);
		    System.out.println("The " + n + "th smallest number is: " + numbers[n-1]);
		  }

	}

