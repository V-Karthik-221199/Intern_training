package day1exercises;

import java.util.Scanner;

public class Ex15b {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		Helper15b h = new Helper15b();
		
		if(h.isPalindrome(num))
			System.out.println(num+" is a palindrome number");
		
		else if(h.isArmstrong(num))
			System.out.println(num+" is an armstrong number");
		
		else if(h.isPerfectnumber(num))
			System.out.println(num+" is a perfect number");
		
		else
			System.out.println(num+ " is not a perfect number, not an armstrong number and also not a palindrome number");
		
		sc.close();
	}
}

class Helper15b {
	
	public boolean isArmstrong(int n)
	{
		int res=0,num,temp=n;
		while( n>0 )
		{
			num = n%10;
			res += (num*num*num);
			n = n/10;
		}
		if( temp == res )
			return true;
		else
			return false;
	}
	public boolean isPalindrome(int n)
	{
		int rev=0,num,temp=n;
		while( n>0 )
		{
			num = n%10;
			rev = (rev*10)+num;
			n = n/10;
		}
		if(temp == rev)
			return true;
		else
			return false;
	}
	public boolean isPerfectnumber(int n)
	{
		int i,sum=0;
		
		for(i=1;i<=n/2;i++)
			if(n%i==0)
				sum+=i;
		if(sum==n)
			return true;
		else
			return false;
	}
 }
