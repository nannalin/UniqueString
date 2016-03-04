import java.util.*;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String myString = "";
		System.out.println("Please enter the string: ");
		myString = in.nextLine();
		
		boolean check = checkUnique(myString);
		System.out.println(check);
	}
	
	private static boolean checkUnique(String str) {
		for(int i = 0; i < str.length() - 1; i++) {
			for(int j = i+1; j < str.length(); j++) {
				char a = str.charAt(i);
				char b = str.charAt(j);
				
				if (a == b) {
					return false;
				}				
			}
		}				
		return true;
	}
}
