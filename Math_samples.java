package test.ravi.edu;

import java.math.BigDecimal;
import java.util.Arrays;

public class Math_samples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 1234;
		x /= 100;
		System.out.println(x);
		
		//This works because Double.toString(d) performs a small amount of rounding on your behalf, but it is not much. If you are wondering what it might look like without rounding:

			System.out.println(new BigDecimal(0.1));
			System.out.println(new BigDecimal(x));
			
	}
}