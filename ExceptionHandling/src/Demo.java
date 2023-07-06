
public class Demo {

	public static void main(String[] args) {
		try {
		myStack s1 = new myStack (4);
		s1.push(12);
		s1.push(8);
		s1.push(5);
		s1.push(8);
		s1.push(5);
		s1.push(8);
		 
		
		//System.out.println(s1);
		
		s1.pop();
		s1.pop();
		s1.pop();
		
		
		System.out.println(s1);

	}
		
	catch(StackOverflow obj)
		{
		System.out.println(obj.getMessage());
		}
	catch(StackUnderFlow obj)
		{
		System.out.println(obj.getMessage());
		}

}
}
