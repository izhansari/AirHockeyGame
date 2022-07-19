import java.util.Random;

//import stuff.lecture08.DateCalculator;

public class Runner {

	public static void main(String[] args) {
		//public enum PLAYERNAMES {ALI, HAMZA, WASEEM, MUSA};
	    Console userInput = new Console();
	    
	    String p1= "";
	    String p2= "";
	    String p3= "";
	    String p4= "";
	    
	   	int team1 = 0;
		int team2 = 0;
		
		System.out.print("What are you playing up to? ");
		int playUpTo = userInput.askForAnInt();
		System.out.print(""); 
		System.out.println("Who all is playing? ");
		p1 = userInput.askForAString();
		p2 = userInput.askForAString();
		p3 = userInput.askForAString();
		p4 = userInput.askForAString();

		System.out.println(" "); 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~START GAME~~~~~~~~~~~~~~~~~~~~~~~");


		
		Random y = new Random();
		int player= y.nextInt(4);
		while (team1 < playUpTo && team2 < playUpTo){	
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~SCORE:~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~TEAM 1: " + team1 +   "~~~~~~~~~~~~~~~~~~TEAM 2: " + team2 + "~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");

		System.out.print("Player: ");
		switch(player){
		case 0:
			System.out.print(p1);
			break;
			
		case 1:
			System.out.print(p2);
			break;
			
		case 2:
			System.out.print(p3);
			break;

		case 3:
			System.out.print(p4);
			break;
			}

		
		int options = 8;
		int choice = y.nextInt(options + (options/4));
		System.out.println();
				
		
		switch(choice){
		case 0:
			System.out.println("2 second switch");
			break;
			
		case 1:
			System.out.println("one person one puck");
			break;
			
		case 2:
			System.out.println("left handed");
			break;

		case 3:
			System.out.println("black barrier");
			break;

		case 4:
			System.out.println("sideways standing");
			break;

		case 5:
			System.out.println("one person hold two pucks");
			break;

		case 6:
			System.out.println("one person one puck stationary");
			break;
			
		case 7:
			System.out.println("two hands one puck");
			break;
			
		default:
			System.out.println("No handicap");
			break;
		}
		
		System.out.print("Which team scored? ");
		if(1 == userInput.askForADouble()) team1++;
		else team2++;
		System.out.print("");
		
		if(team1 == playUpTo){
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~GAME OVER:~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~T-E-A-M-1-W-I-N-S~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");

		}
		if(team2 == playUpTo){
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~GAME OVER:~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~T-E-A-M-2-W-I-N-S~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");

		}
		
		System.out.println(" ");
		player= y.nextInt(4);

		}//end of while loop
		
	}
}
