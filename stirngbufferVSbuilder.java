package test.ravi.edu;

public class stirngbufferVSbuilder {
    public static void main(String[] args) {
        int N = 77777777;
        long t;
		String tester = null;
		
		{
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                tester +=  "";
            }
            System.out.println(System.currentTimeMillis() - t);
		}
		
        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }
}