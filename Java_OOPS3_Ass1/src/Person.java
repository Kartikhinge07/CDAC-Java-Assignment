  class Person {
	 private String name;
	 private Date dob;
	 
	 Person ()
	 {
		 
	 }
	 public Person (String name ,int d, int m , int y)
	 {
		 this.name=name;
		 dob=new Date(d,m,y);
		 
		 
	 }
	 public String Show()
	 {
		 String str=dob.Show();
		 return "\t" +name+ str;
	 }
	 public void display()
	 {
		System.out.println("Name :" + name);
		dob.display();
	 }
	 public Person(String nm ,Date d1 )
	 {
		 this.name=nm;
		 this.dob=d1;
	 }
	 

}
