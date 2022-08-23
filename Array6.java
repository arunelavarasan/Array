package Array;
//WAP to find product of all the odd elements in the array 
public class Array6 {

	public static void main(String[] args) {
		int [] a = {21, 22, 13, 3, 11};
		int pro = 1;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				pro = pro * a[i];
			}
		}
		System.out.println(pro);
	}

}
