import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterators
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
			a.add(i);
		System.out.println(a);

		//At beginning itr(cursor) will point to index just before the first element in a 
		Iterator itr=a.iterator();

		//Checking the next element availability
		while(itr.hasNext())
		{
			//Moving cursor to next element
			int i=(Integer)itr.next();

			//Getting even elements one by on
			System.out.print(i+" ");

			//Removing odd elements
			if (i%2!=0)
				itr.remove();
		}

		System.out.println();
		System.out.println(a);
	}
}