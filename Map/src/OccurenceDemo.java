import java.util.TreeMap;

public class OccurenceDemo {

	public static void main(String[] args) {

		String str ="AABCDCABD";
		int cnt =0;
		TreeMap<Character, Integer> t1 = new TreeMap<>();
		for( int i=0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			if (t1.containsKey(ch))
			{
				 cnt = t1.get(ch);
				cnt ++ ;
				t1.put(ch,cnt);
			}
			else
			{
				t1.put(ch, 1);
			}

		}
		System.out.println(t1);

	}
}
