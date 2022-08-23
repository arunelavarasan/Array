package Array;

public class Array1 {

	public static void main(String arg[]) {
		int n = 9;
		for(int i = 1; i<=9 ; i++)
		{
			n = n*(n-i);
			System.out.println(n);
		}
	}
}
