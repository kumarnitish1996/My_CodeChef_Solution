import java.util.*;
class TLG
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		
		int flag=0,max=0;
		int[] arr1=new int[t];
	    int[] arr2=new int[t];
	    
	    arr1[0]=in.nextInt();
	    arr2[0]=in.nextInt();
	    
	    for (int i=1;i<t;i++){
	        arr1[i]=in.nextInt()+arr1[i-1];
	        arr2[i]=in.nextInt()+arr2[i-1];
	    }
	    
	    for(int i=0;i<t;i++){
	        if (max<Math.abs(arr1[i]-arr2[i])){
	            max=Math.abs(arr1[i]-arr2[i]);
	            if(arr1[i]>arr2[i])flag=1;
	            else flag=2;
	        }
	        
	    }
	    System.out.println(flag+" "+max);
	    in.close();
	}
}