import java.util.Scanner;
class EnormousInputTest{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int k=obj.nextInt();
		long[] arr=new long[n];
		int flag=0,i;
		
	for(i=0;i<n;i++){
		arr[i]=obj.nextInt();
		}
		
	for(i=0;i<n;i++){
		if(arr[i]%k==0)
		{
			flag++;
		}
	}
		
	System.out.println(flag);
	obj.close();
	
	}
 } 