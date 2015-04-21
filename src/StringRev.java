import java.util.Scanner;


public class StringRev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string to reverse :");
		String before=sc.nextLine();
		String[] arr=before.split(" ");
		int len=arr.length;
		String after="";
		for (int i = len-1; i>=0; i--) {
			after+=arr[i]+" ";
			
		}
		System.out.println("after reverse :");
		System.out.println(after);
		
	}

}
