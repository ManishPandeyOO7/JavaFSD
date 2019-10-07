import java.util.Scanner;

public class StringSplitDemo {
	
	
	String []splitDemo(String input,String limit){
		
		
		
		int length=input.length();
		String []splits=new String[length];
		
		
		for(int i=0;i<length;i++) {
			String oneString=String.valueOf(input.charAt(i));
			if(oneString.equals(limit)) {
				
				splits[i]=" ";
				continue;
			}
			else {
				splits[i]=oneString;
			}	
			
		}	
		return splits;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("ENTER A STRING");
		String input=sc.nextLine();
		
		System.out.println("ENTER A Delimiter");
		String limit=sc.nextLine();
    
		StringSplitDemo ob = new StringSplitDemo();
			
		String[] Answer  =ob.splitDemo(input,limit);
		for(int i=0;i<Answer.length;i++) {
			if(Answer[i]==" ") {
			System.out.print("\n");
			
		}
		else {
			System.out.print(Answer[i]);
		}
		}
		
		
	}

}
