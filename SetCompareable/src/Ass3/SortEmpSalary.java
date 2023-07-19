  
package Ass3;

import java.util.Comparator;

public class SortEmpSalary implements Comparator<Emp>{
	
	public int compare(Emp e1 ,Emp e2)
	{
		return ((int)e1.getSalary())-((int)e2.getSalary());
	}
	

}
