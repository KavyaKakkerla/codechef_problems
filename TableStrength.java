/*


*/





import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int s=0;s<t;s++)
		{
		    int n;
		    n=sc.nextInt();
		    int []a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int max=-9999;
		    Arrays.sort(a);
		    for(int j=0;j<n;j++)
		    {
		        int value=0;
		        value=a[j]*(n-j);
		        max=Math.max(value,max);
		        
		    }
		    System.out.println(max);
		    
		}

	}
}




