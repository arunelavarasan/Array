package Array;

public class Array7 {

	public static void main(String[] args) {
		int [] a = {19,23,41,64,18};
		
		for(int i = 0; i<a.length;i++)
		{
			int n = a[i];
			int sum = 0;
			while(n!=0)
			{
				int d = n%10;
				sum = sum + d;
				n = n/10;
			}
			if(sum == 5)
			{
				System.out.println(a[i]);
			}
		}
	}
}
// 1+9 = 10 reject  
// 2+3 = 5 select
// 4+1 = 5 select
// 6+4 = 10 reject 
// 1+8 = 10 reject
