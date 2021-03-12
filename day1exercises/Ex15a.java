package day1exercises;


public class Ex15a {
	public static void main(String[] args) {
		int n=100;
		boolean primes[]=new boolean[n+1];
		int i,j;

		for(i=2;i<=n;i++)
			primes[i]=true;
		
		for(i=2;i*i<=n;i++)
		{
			if(primes[i]==true)
				for(j=i*i;j<=n;j=j+i)
					primes[j]=false;
		}
		System.out.println("List of Primes from 1 to 100 : ");
		
		for(i=2;i<=n;i++)
		{
			if(primes[i]==true) {
				System.out.println(i);
			}
		}
	}
}
