
public class BookDemo {
	public static void main(String [] a)
	{
		Book b1= new Book ("java", 400);
		Book b2= new Book ("DBMS", 500);
		Book b3= new Book ("python", 800);
		Book b4= new Book ("c", 100);
		Book b5= new Book ("c++", 200);
		
		Book b[] = new Book[5];
		b[0]=b1;
		b[1]=b2;
		b[2]=b3;
		b[3]=b4;
		b[4]=b5;
		for(int i=0;i<5;i++)
		b[i].display();
	}

}
