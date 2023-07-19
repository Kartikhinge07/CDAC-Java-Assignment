 package Ass3;

import java.util.Comparator;

public class SortEmpId implements Comparator<Emp>
{
	public int compare(Emp e1 , Emp e2)
	{
		return e1.geteId()-e2.geteId();
	}


}
