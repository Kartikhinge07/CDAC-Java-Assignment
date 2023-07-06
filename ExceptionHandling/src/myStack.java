import java.util.Arrays;

public class myStack {
	int top ;
	int size;
	int arr[];
	public myStack(int size)
	{
		top = -1 ;
		this.size=size;
		arr = new int[size];
	}
	public void push (int element) throws StackOverflow 
	{
		if(top >= size-1)
			throw new StackOverflow();
		top++;
		arr[top] = element ;
	}
	public void pop() throws StackUnderFlow
	{
		if(top == -1 )
			throw new StackUnderFlow();
		top--;
	}
	
	public String toString()
	{
		return "stack " + Arrays.toString(arr);
	}

}
