package test.ravi.edu;

import java.util.*;
public class TestFromClass {


	// constructor

	public TestFromClass() {

	}

	public static void main(String[] args) {
		TestFromClass tc = new TestFromClass();
		tc.run();
	}

	private void persistTokens (String str) {
		
		StringTokenizer tokenizer = new StringTokenizer(str, ", ");
		for(int count = 0; tokenizer.hasMoreTokens(); count++)
		{
			System.out.println("Tokens # "+count+" and next = " + tokenizer.nextToken() ); 
		}
		

	}

			
	public void run() {
		String str = "this is what it is";
		System.out.println("substring starts here> " + str.substring(7, 18));
	//	persistTokens("mary, had a little lamb");
	
	/* iterate thru Map
		for (Map.Entry<String, String> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		*/
		char ch1 = 'a';
		ch1 = Character.toUpperCase(ch1);
		
		if(ch1 == 'A')
		{
			 System.out.println("this is uppercase! = " +ch1 );
		}
		
		/*
		for (char ch = 'A'; ch <='Z'; ch++){
			 System.out.println("counter = " +ch );
		}
		*/

	}
	

}
