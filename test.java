package test.ravi.edu;

import java.text.DecimalFormat;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }


	static String intToString(int num, int digits) {
    assert digits > 0 : "Invalid number of digits";

    // create variable length array of zeros
    char[] zeros = new char[digits];
    Arrays.fill(zeros, '0');
    // format number as String
    DecimalFormat df = new DecimalFormat(String.valueOf(zeros));

    return df.format(num);
}
}