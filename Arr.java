import java.util.Scanner;
public class Arr 
{

	public static void main(String arg[])
	{  
		int[] a= {10,20,30,40,50,60};
		
		int i=0,j=a.length-1,co=0;
		while(i<j)
		{
			int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		i++;
		j--;
		co++;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
	}
}