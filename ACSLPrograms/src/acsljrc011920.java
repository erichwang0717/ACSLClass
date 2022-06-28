import java.util.*;
public class acsljrc011920 {
	static Scanner in;
	
	static String N;
	static int P, D;
	
	static String output;
	
	public static void main(String[] args) {
		in = new Scanner (System.in);
		for(int i = 0; i <10; i++) {
		//System.out.println(leftmost(978742));
		init();
		solve();
		output();
		}
	}
	
	public static void init() {
		
		
		N= in.next();
		P= in.nextInt();
		D= in.nextInt();
		
		output = " ";
	}
	
	public static void solve() {
		int digit = pthDigit(N, P);
		System.out.println(digit);
		if(digit>=0 && digit <= 4) {
			digit += D; 
			digit %= 10;
		} else {
			digit = Math.abs(digit - D);
			digit = leftmost(digit);
		}
		//System.out.println(digit);
		char [] o = new char[N.length()];
		o[N.length() - P] = (char)(digit + '0');
		for(int i = 0; i<N.length(); i++) {
			if(i<N.length() - P) {
				o[i] = N.charAt(i);
			}
			if(i> N.length() - P) {
				o[i] = '0';
			}
		}
		output = new String(o);
	}
	
	public static void output () {
		System.out.println(output);
	}
	public static int pthDigit(String N, int P) {
		char c = N.charAt(N.length()- P);
		return c - '0';
	}
	
	public static int leftmost(int num) {
		while (num > 9 ) {
			num /= 10;
		}
		return num;
	}
}
