import java.util.*;
public class acsljrc012018 {
	static Scanner in; 
	
	static String s1, s2, s3, s4, s5;
	
	static String output; 
	
	public static void main(String[] args) {
		input();
		solve();
		output();  

	}
	public static void input() {
		in = new Scanner (System.in);
		
		s1 = in.next();
		s2 = in.next();
		s3 = in.next();
		s4 = in.next();
		s5 = in.next();
		
		output = " ";
	}
	
	public static void solve() {
		int count1 = s1.length();
		output += count1 + "\n";
		
		int sum = 0;
		for (int i = 0; i<s2.length(); i++) {
			char c = s2.charAt(i);
			sum += c - '0';
		}
		output += sum + "\n";
		
		int sum2 = 0;
		for(int j = 0; j<s2.length(); j++) {
			if (s2.charAt())
			char o = s2.charAt(j);
		}
		
		
	}
	
	public static void output() {
		System.out.println(output);
	}

}
