import java.util.Arrays;
import java.util.Scanner;
 
 class T_Sort {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] array = new int[test];
		for(int i=0;i<test;i++)
		{
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<test;i++)
		{
			System.out.println(array[i]);
		}
 
		sc.close();
	}
 
}

