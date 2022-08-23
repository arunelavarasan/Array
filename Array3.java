package Array;

public class Array3 {

	public static void main(String[] args) {
		int[] a = {21,22,13,3,10};
		for(int i = 1; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i] + " ");
			}
		}
	}

}
