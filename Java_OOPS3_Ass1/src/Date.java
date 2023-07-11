
public class Date {
	private int day,month,year;
	public Date()
	{
		day=month=year=0;
	} 
	public Date (int day, int month ,  int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String Show()
	{
		return "\t" +day+ "\t" +month+ "\t" +year ; 
	}
	public void display ()
	{
		System.out.println("Date " +day+ "\t" +month+ "\t" +year);
	}
	

}