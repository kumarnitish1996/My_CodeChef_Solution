import java.math.BigInteger;
import java.util.Scanner;
 
public class SmallFactorials{
 
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int loop = sc.nextInt();
			for(int j=loop;j>0;j--){
				BigIntegerFactorial(sc.nextInt());
			}
			sc.close();
	}
	public static void BigIntegerFactorial(int number){
		BigInteger results = BigInteger.ONE;
		for(int i = number; i>0; i--){
			results = results.multiply(BigInteger.valueOf((long) (i)));
		
		}
		System.out.println(results);
		
	}

 
}  