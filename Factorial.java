import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        while(a-- >0)
        {
		int p = 0,n = 0;
		n=s.nextInt();
	
			while(n!= 0)
			{
			n = n/5;
			p += n;
			}
		
	System.out.println(p);
        }
	 s.close();
    }
} 