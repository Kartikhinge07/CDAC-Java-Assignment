import java.util.* ;

public class Ass_2 {
	public static void main(String []a)
	{
		int size , arr[] , i ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array : " );
		size = sc.nextInt();
		arr= new int [size];
		System.out.println("Enter Elements " + size );
		for (  i=0 ; i<arr.length ; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for (  i=0 ; i<arr.length ; i++)
		{
		System.out.println(" Array is : " + arr[i]);
		}
		try 
		{
			System.out.println("Enter element to Search : ");
			int Index = sc.nextInt();
			System.out.println("Element is at Index : " + arr[Index]);
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			//System.out.println(obj.getMessage());
			obj.printStackTrace();
			
		}
	
	
	}
}
