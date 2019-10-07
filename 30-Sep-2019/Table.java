import java.util.*;
public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER A Number");
		System.out.println("PLEASE ENTER A Limit");
		int num =sc.nextInt();
		int limit =sc.nextInt();
		
		
		for(int i=1;i<=limit;i++) {
			
			System.out.println(num+"*"+i+"="+(num*i));
			
			
		}
		
		
	
		
	}

}
