package test.ravi.edu;

public class TestBasics {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestBasics tb = new TestBasics();
		//tb.countUpperCase("This is where im from, Trenton");

        System.out.println("***Post increment test***");
        int n = 10;
        System.out.println(n);      // output  10
        System.out.println(n++);    // output  10
        System.out.println(n);      // output  11
 
        System.out.println("***Pre increment test***");
        int m = 10;
        System.out.println(m);      // output  10
        System.out.println(++m);    // output  11
        System.out.println(m);      // output  11
    
        
        TestBasics tb = new TestBasics();
        int counter = 0;
        counter = tb.countUpperCase("tHIS is what UPPER is");
        System.out.println("counter: "+counter);
		
	}
	
	
	private  int countUpperCase(String str){
		
		int count = 0;
		
		for (int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("ch in loop = "+ ch);
			
			if(Character.isUpperCase(ch)){
				count++;
			    System.out.println("Element: " + ch);
			}

		}
//		Enhanced for loop:
/*
		for (String element : str.length() ) {
		    System.out.println("Element: " + element);
		}
	*/
		return count;
		
	}

}
