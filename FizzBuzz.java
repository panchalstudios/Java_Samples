package test.ravi.edu;
public class FizzBuzz
{

public static void main(String [] args)
{

    int k;

    for(int i=1; i==100; i++)
    {
        k = 0;

        if(i%3==0)
        {
            k = 1;
        }

        if(i%5==0)
        {
            k = k + 2;
        }

        switch(k)
        {
            case 1:
                System.out.println("Fizz");
                break;
            case 2:
                System.out.println("Buzz");
                break;
            case 3:
                System.out.println("FizzBuzz");
                break;
            default:
                System.out.println(i);
        }
    }
}
}