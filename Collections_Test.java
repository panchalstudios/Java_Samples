package test.ravi.edu;

import java.util.*;

public class Collections_Test {

	private static void string_concat(StringBuilder sb, int count) {
		if (count >= 9999)
			return;
		string_concat(sb.append(count), count + 1);
	}

	public static void main(String[] arg) {

		// set timing
		long s = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9999; i++) {
			sb.append(i);
		}
		System.out.println(System.currentTimeMillis() - s);
		s = System.currentTimeMillis();
		string_concat(new StringBuilder(), 0);
		System.out.println(System.currentTimeMillis() - s);

		ArrayList<String> aStrarr = new ArrayList<String>(
				Arrays.asList("a", "b", "c", "d", "a", "e", "f", "g", "h", "a",
						"i", "j", "k", "l"));
		checkDuplicate(aStrarr);

	// static factory methods
		String[] myArray = { "Java", "J2EE", "XML", "JNDI" };
		// Instead of:
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Standard way: " + myArray[i]);
		}

		// You can use:
		System.out.println("\nFactory way: " + Arrays.asList(myArray)); // factory method Arrays.asList(…)

		// boolean test
		System.out.println("\nBoolean test:  " + valueOf(true));
		
		
	}

	public static Boolean valueOf(boolean b) {
		return (b ? Boolean.TRUE : Boolean.FALSE);
	}

	public static boolean checkDuplicate(ArrayList<String> list) {
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			boolean val = set.add(list.get(i));
			if (val == false) {
				return val;
			}
		}
		return true;
	}

	private List<String> checkListForDuplicates(ArrayList<String> target) {

		// getting duplicates from arrayList
		List<String> duplicateValues = null;
		Set<String> uniqueValues = new HashSet<String>();
		if (target != null && !target.isEmpty()) {
			for (String value : target) {
				if (!uniqueValues.add(value)) {
					if (duplicateValues == null) {
						duplicateValues = new ArrayList<String>();
					}
					System.out.println("value = " + value);
					duplicateValues.add(value);
				}
			}
		}
		return duplicateValues;
	}
}
