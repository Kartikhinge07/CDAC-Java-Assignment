
public class wageEmp extends Emp {
	
	
		int hrs , rate ;
		public wageEmp()
		{
			
		}
		public wageEmp(String name , int age  , int eid , double salary, int hrs ,int rate)
		{
			super(name,age,eid,salary);
			this.hrs=hrs;
			this.rate=rate;
		}
		public String toString()
		{
			// super.toString();  ( Can done with both)
			// return super.toString + "\t" + "Hours "  + hrs + "\t" +  "rate " +rate ;
			String str = super.toString();
			return str + "\t" + "Hours "  + hrs + "\t" +  "rate " +rate ;
		}
		public static void main (String [] args)
		{
		
		Person p[] = new Person[3];
		p[0] = new Person("Seeta ", 20);
		p[1]= new Emp("Seeta", 20 , 101 ,10000);
		p[2] = new wageEmp("Seeta" , 20,101,10000,1,12 );
		 
		for( int i=0 ; i<p.length ; i++)
			System.out.println("Information : " + p[i]);
		}

}
