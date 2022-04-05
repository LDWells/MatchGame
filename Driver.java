// LaDarion Wells
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		MatchGame lastmatch = new MatchGame();

		Scanner keyboard = new Scanner(System.in);
		System.out.println(lastmatch.toString());
		boolean playerOne = true;
		
		while(lastmatch.checkGameEnd()==false) {
			if(playerOne == true) {
				System.out.println("Player Ones turn:");
			}
			else {
				System.out.println("Player Twos turn");
			}
			System.out.println("Choose a bin");
			int gameBin = keyboard.nextInt();
			
			System.out.println("How many matches are you removing?");
			int matches = keyboard.nextInt();
			
			if(lastmatch.removeMatches(matches, gameBin-1) == true) {
				System.out.println(lastmatch);
				playerOne = !playerOne;
			}else {
				System.out.println("Invalid move: Try another input");
			}
			
			
			
		}
		keyboard.close();
		if(playerOne == true) {
			System.out.println("Player 1 won!");
			
		}else {
			System.out.println("Player 2 won!");
		}
	}

}
