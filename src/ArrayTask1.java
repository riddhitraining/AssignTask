import java.util.Scanner;

public class ArrayTask1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total number of array: ");
	
		int totalnumbers= sc.nextInt();
		
		int numbers[]= new int[totalnumbers];
		
		for(int i=0; i<totalnumbers; i++)
		{
			System.out.println("Enter number "+ (i+1) + ":");
			int value = sc.nextInt();	
			numbers[i]= value;
		}
		
		int maxNumber= findMaxNumber(numbers);
		System.out.println("Maximum number is: "+ maxNumber);
		
		int minNumber= findMinNumber(numbers);
		System.out.println("Minimum number is: "+ minNumber);
		
		int sum= findSumOfNumber(numbers);
		System.out.println("Sum of numbers is: "+ sum);
		
		System.out.println("Avg of numbers is: "+ (sum)/totalnumbers);
		
		int evenNumber= findEvenNumber(numbers);
		
		int secondHighestNumber= findSecondHighestNumber(numbers);
		System.out.println("Second Highest number is: "+ secondHighestNumber);
	}
		public static int findMaxNumber(int numbers[])
		{
			int maxNumber =0;
			for(int number: numbers)
			{
				if(maxNumber < number)
				{
					maxNumber = number;
				}
			}
			return maxNumber;
		}
		public static int findMinNumber(int numbers[])
		{
			int minNumber= numbers[0];
			for(int number:numbers)
			{
				if(minNumber>number)
				{
					minNumber=number;		
				}
			}
		return minNumber;
		}
		public static int findSumOfNumber(int numbers[])
		{
			int sum=0;
			for(int number:numbers)
			{
					sum= sum + number;
				}
		return sum;
		}
		public static int findEvenNumber(int numbers[])
		{
			int evenNumber=0;
			for(int number:numbers)
			{
				if(number%2==0)
				{
					System.out.println("Even number is: "+ number);
				}
			}return evenNumber;
		}
		
		public static int findSecondHighestNumber(int numbers[])
		{
			int HighestNumber=0;
			int secondHighestNumber=HighestNumber;
			for(int number:numbers)
			{
				if(number>HighestNumber)
				{
					secondHighestNumber=HighestNumber;
					HighestNumber=number;
				}else if(number>secondHighestNumber)
				{
					secondHighestNumber=number;
				}
			}return secondHighestNumber;
		}
		
		}
		
	
