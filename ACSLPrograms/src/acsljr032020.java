import java.util.*;

public class acsljr032020 {
	
	// input
	static Scanner in;
	
	// problem related
	static ArrayList<Integer> list1, list2, list3;
	
	//output
	static int sOL; // sum of all largest
	
	public static void main(String[] args) {
		init();
		solve();
		output();

	}
	
	public static void init() {
		in = new Scanner(System.in);
		
		list1 = new ArrayList<Integer>();
		list2 = new ArrayList<Integer>();
		list3 = new ArrayList<Integer>();
		
		String line1 = in.nextLine();
		StringTokenizer st = new StringTokenizer(line1);
		while(st.hasMoreTokens()) {
			list1.add(Integer.parseInt(st.nextToken()));
		}
		
		String line2 = in.nextLine();
		st = new StringTokenizer(line2);
		while(st.hasMoreTokens()) {
			list2.add(Integer.parseInt(st.nextToken()));
		}
		
		String line3 = in.nextLine();
		st = new StringTokenizer(line3);
		while(st.hasMoreTokens()) {
			list3.add(Integer.parseInt(st.nextToken()));
		}
		sOL = 0;
	}
	
	public static void solve() {
		int l = Math.max(list1.size(), Math.max(list2.size(),list3.size()));
		for (int i = 0; i <1; i++) {
			int largest = Integer.MIN_VALUE;
			if(i< list1.size()) {
				if(list1.get(i) > largest) {
					largest = list1.get(i);
				}
			}
		if(i<list2.size()) {
			if(list2.get(i) > largest) {
				largest = list2.get(i);
						
			}
		}
		if(i<list3.size()) {
			if(list3.get(i) > largest) {
				largest = list3.get(i);
			}
		
		}
		sOL += largest;
		}
	}
	
	public static void output() {
		System.out.println(sOL);
	}
}
