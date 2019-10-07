package demo2;
import java.util.*;

public class PassingThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER three Numbers");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		int sum=num1+num2+num3;
		int count=0;
	if(num1<40)
		count++;
	if(num2<40)
		count++;
	if(num3<40)
		count++;
	if(sum<125)
		count++;
	if(count==0)
		System.out.print("passed");
	if(count!=0)
		System.out.print("Failed");
		
	
	

	}

}
