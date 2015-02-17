package test.ravi.edu;

import java.util.Date;

public class String_Stuff {

	public static void main(String[] args) {
		// 11 hours and 12 minutes
		String date = String
				.format("%1$tH hours and %1$tM minutes", new Date());
		System.out.println(date);

		// 00234
		String padding = String.format("%05d", 234);
		System.out.println(padding);

		// passed
		String test = "234";
		String test_passed = String.format("%05d", test);
		System.out.println("this is formated: " + test_passed);
		System.out.println("this is orignal: " + test);

// TODO add something here
	}


}
