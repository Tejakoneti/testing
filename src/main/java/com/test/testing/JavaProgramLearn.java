package codePractice;

import java.util.Scanner;

public class StringPair {
	
	public static int countVowels;
	
	public static int getPairsCount;
	
	public static String[] units = { "", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };
	
	public static String[] tens = { 
			"", "",	"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
	};
	
	public static String convert(int n) {		

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}
		
		return "hundred";
		
	}
	
	public static int findingVowels(String digitName) {
		
		
		for(int i=0; i<digitName.length(); i++) {
	         if(digitName.charAt(i) == 'a'|| digitName.charAt(i) == 'e'|| digitName.charAt(i) == 'i' || digitName.charAt(i) == 'o' || digitName.charAt(i) == 'u') {
	        	 countVowels ++;
	         }
		}
		
		return countVowels;
	}
	
	public static void getPairsCount(int[] arr, int sum) 
    {          
           
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i + 1; j < arr.length; j++) {
        		if ((arr[i] + arr[j]) == sum) {
        			getPairsCount++;
        		}
        	}
        }                  
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("No.of digits");		
		int number = obj.nextInt();
		int[] digits = new int[number];
		
		for(int i = 0; i<number; i++) {
			System.out.println("Enter the digit");
			digits[i] = obj.nextInt();
		}
		
		for(int j = 0; j < digits.length; j++) {
			if(!(digits[j] < 1) && !(digits[j] >100)) {
				findingVowels(convert(digits[j]));
			} else {
				System.out.println("The digit not satisfying the conditon 1 <= N <=100 ");
			}
		}
		
		getPairsCount(digits, countVowels);		
		
		System.out.println("Output: "+getPairsCount);
		
		obj.close();
		
	}

}
