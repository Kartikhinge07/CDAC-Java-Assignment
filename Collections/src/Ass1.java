import java.util.*;
public class Ass1 {
	public static void main (String [] args )
	{
		ArrayList<String> a1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int ch   ; 
		String city;

		do {

			System.out.println(" -----------------------------");
			System.out.println("\n 1. Add  2.Display  3. Search  4.Delete  0.EXIT ");
			System.out.println("\n Enter your choice "  );

			ch=sc.nextInt();

			switch (ch) 
			{
			case 1:
				System.out.println("Enter City \n");
				city=sc.next();
				a1.add(city);
				//System.out.println(a1);
				break ;

			case 2 :

				System.out.println(a1);

				break;

			case 3 :
				System.out.println("Enter City for search");
				city=sc.next();


				if(a1.contains(city))
				{
					System.out.println("available");

				}
				else {
					System.out.println("not available");
				}

				break ;

			case 4 :
				System.out.println("Enter city to delete");
				city=sc.next();
				a1.remove(city);
				System.out.println(a1);
				break;

			default:

				System.out.println("Invalid Choice");
				break;

			case 0 :
				break;

			}
		} while (ch != 0);
	}

}
