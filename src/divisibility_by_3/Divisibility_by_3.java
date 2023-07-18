package divisibility_by_3;

import java.util.Scanner;

/*
 Divisibility by 3
Given a number in the form of an array A of size N. Each of the digits of the number is represented by A[i]. Check if the number is divisible by 3.

	Input 1:
	
	A = [1, 2, 3]
	
	Input 2:
	
	A = [1, 0, 0, 1, 2]
	
	Output 1:1
	
	Output 2: 0
 */
public class Divisibility_by_3 {

	private static int  divisible_by_3(int sum) {
		int answer=0;
		if(sum%3==0)
		{
			answer=1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=0;
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
			sum+=array[i];
		}
		System.out.println(divisible_by_3(sum));
		
	}

	

}
