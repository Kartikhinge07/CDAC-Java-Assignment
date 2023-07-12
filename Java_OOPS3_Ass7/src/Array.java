
public class Array {
	public static void main(String[] args)
	{		
			int a[] = {16,3,70,8,6};
			int max = a[0] , min = a[0] , average = 0 , sum = 0;
			int i;

			for(   i = 0 ; i<a.length ; i++ )
			{
				System.out.print("\t" + a[i]);
			}

			for(   i = 0 ; i<5 ; i++ )
			{
				if(a[i]>max)
				max = a[i];
				
				if(a[i]<min)
				min = a[i];
			}
			
			System.out.println("");
			System.out.println("Minimum value is : " + min);
			System.out.println("Maximum value is : " +max);
			
			for(   i = 0 ; i<5 ; i++ )
			{
				sum += a[i];	
			}

			average = sum/5;

			System.out.println(average);
			
			
		}
		
}

