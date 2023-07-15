import java.util.*;
public class UsingScanner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0 , size ,arr[];
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr= new int[size];
		System.out.println("enter " +size+ " Elements");
		for(int i=0; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
		}
		/*for (  i=0 ; i<arr.length ; i++)
		{
		System.out.println(" Array is : " + arr[i]);
		} */
		System.out.println("sum : " +sum);
	}

}
