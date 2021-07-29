import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorsDemo
{
	public static void main(String[] args)
	{
		LinkedList<Integer> a=new LinkedList<Integer>();
		
		for(int i=0;i<10;i++)
			a.add(i);
		System.out.println(a);

		//At beginning itr(cursor) will point to index just before the first element in a 
		ListIterator itr=a.listIterator();

		//Checking the next element availability
		while(itr.hasNext())
		{
			//Moving cursor to next element
			int i=(Integer)itr.next();

			//Getting even elements one by on
			System.out.print(i+" ");

			//Changing odd numbers to even and adding modified number
			if (i%2!=0)
			{
				i++; //Change to odd
				itr.set(i); //Set method to change value
				itr.add(i); //to add
			}
		}

		System.out.println();
		System.out.println(a);
	}
}