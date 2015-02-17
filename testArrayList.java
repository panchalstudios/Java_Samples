package test.ravi.edu;

import java.util.ArrayList;
import java.util.*;

public class testArrayList {

	
	
	  public static void main(String args[]) {
		  testArrayList ta = new testArrayList();
		  //ta.run();
		  ta.fizzBuzz();
		  
	  }
	public void run(){
		ArrayList <String> slist = new ArrayList<String>();
		ArrayList <String> tlist = new ArrayList<String>();
		slist.add("1234");
		tlist.add("12345");
		
		System.out.println("are they same? " + slist.equals(tlist) );
		
		int k =0;
		while(true)
		{
			String line  = "THis is it?";
			if(line.equals("") )	break;
			
			slist.add(line);
			
			for(int i=0; i < slist.size() - 1; i++ )
			{
				System.out.println(slist.get(i));
				System.out.println(i);
				k++;
			}
			
			if(k > 4) break;
			
		}
//		These 2 same in Java 7 +
		List<String> list = new LinkedList<>();
		List<String> list2 = new LinkedList<String>();
	}
	
	public void fizzBuzz() {
	    for(int i = 0; i <= 100; i++) {
	        if(i % (3*5) == 0) System.out.println("FizzBuzz\n");
	        else if(i % 5 == 0) System.out.println("Buzz\n");
	        else if(i % 3 == 0) System.out.println("Fizz\n");

	        /* default */
	        //else System.out.println("%d\n" + i);
	    }

	}
}
