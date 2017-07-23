import java.util.*;
 
class ChefCode
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		int x = input.nextInt();
		double y = input.nextDouble();	
			if(x%5==0 && x + 0.50<=y)
				{
					Double bal = y-x-0.50;
					System.out.printf("%.2f",bal);
				}
			else
					System.out.printf("%.2f",y);
			input.close();
	}
} 