//WAP to display sum of all the elements of the array
package Array;

public class Array4 {

	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60};
		int sum = 0;
		for(int i = 0; i< a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
