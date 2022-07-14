import java.util.*;
public class acsljr012017 {
	static Scanner in;
	
	static int initPoints;
	static int[] hand;
	static int[] queuedCards;
	
	static int endPoint;
	static String winner;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		for(int i = 0; i <5; i++) {
		init();
		solve();
		output();
		}
	}
	
	public static void init() {
		in = new Scanner(System.in);
		
		initPoints = in.nextInt();
		
		hand = new int[3];
		for(int i =0; i < 3;i++) {
			hand[i] = in.nextInt();
		}
		
		queuedCards = new int[7];
		for(int i = 0; i<7; i++) {
			queuedCards[i] = in.nextInt();
		}
		
		endPoint = 0;
		winner = " ";
	}
	
	public static void solve() {
		/* players puts down a card
		 * check win
		   dealer puts down a card
		   check win
		   player puts down a card 1 more time
		   repeat this 3 times
		   set winner
		 */
		int points = initPoints; 
		int nextCardIndex = 0;
		
		for(int i=0; i<3; i++){
			int card = hand[i];
			if(card ==9) {
				//pass
			}else if (card ==4) {
				points -=10;
			}else if(card == 0) {
				if(points + 11 <= 99) {
				points += 11;
				} else {
					points += 1;
				}
			}else {
				points += card;
			}
			hand[i] = queuedCards[nextCardIndex];
			nextCardIndex++;
			if(points >= 100) {
				endPoint = points;
				winner = "dealer";
				return;
			}
		
		card = queuedCards[nextCardIndex];
		nextCardIndex++;
		if(card ==9) {
			//pass
		}else if (card ==4) {
			points -=10;
		}else if(card == 0) {
			if(points + 11 <= 99) {
			points += 11;
			} else {
				points += 1;
			}
		}else {
			points += card;
		}
		if(points >= 100) {
			endPoint = points;
			winner = "dealer";
			return;
		}
		}int card = hand[1];
		if(card ==9) {
			//pass
		}else if (card ==4) {
			points -=10;
		}else if(card == 0) {
			if(points + 11 <= 99) {
			points += 11;
			} else {
				points += 1;
			}
		}else {
			points += card;
		}
		hand[1] = queuedCards[nextCardIndex];
		nextCardIndex++;
		if(points >= 100) {
			endPoint = points;
			winner = "dealer";
			return;
		}
		// int card = hand[0];
		if(card ==9) {
			//pass
		}else if (card ==4) {
			points -=10;
		}else if(card == 0) {
			if(points + 11 <= 99) {
			points += 11;
			} else {
				points += 1;
			}
		}else {
			points += card;
		}
		hand[0] = queuedCards[nextCardIndex];
		nextCardIndex++;
		if(points >= 100) {
			endPoint = points;
			winner = "dealer";
			return;
		}
	}
	public static void output() {
		System.out.println(endPoint + ", " + winner);
	}

}
