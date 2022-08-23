package Array;

public class Array8{
	
	public static void main(String[] args) {

		int [] a = {6,3,1,2,5};
		int sum1 = 0;
		int sum2 = 0;
		int n = a.length + 1;
		sum1 = n*(n+1)/2;
		
		for(int i = 0; i<a.length;i++)
		{
			sum2 = sum2 + a[i];
		}
		int mis = sum1 - sum2 ;
		System.out.println("Missing value in the array is : "+ mis);
		
	
	}
}

/* a[] = {6,3,1,2,5}
 * n = a.length + 1 
 * n = 6
 * 
 * sum = n*(n+1)/2 = 6x7/2 = 42/2 = 21*/
