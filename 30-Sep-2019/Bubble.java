package demo2;
import java.util.*;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER 5 NUMBERS");
		for(int r=0;r<arr.length;r++) {
			arr[r]=sc.nextInt();
		}
			
			
			 int n = arr.length;
		        for (int i = 0; i < n-1; i++)
		            for (int j = i+1 ; j < n-i-1; j++)
		                if (arr[j] > arr[j+1])
		                {
		                  
		                  int   temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
					
					
					
				
				
				
			
		
	
		for(int a :arr) {
			
			System.out.print(a+" ");
		}
		 
		
		

	}

}
