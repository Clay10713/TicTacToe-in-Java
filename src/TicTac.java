import java.util.Scanner;

public class TicTac {
	
	//Array to hold the X or O in each space (The Default value: '_')
	public static char[] place = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};
	
	//Holds X or O, which ever team user chooses
	public static char team = '_';
	
	// Holds X or O, which ever team user does NOT choose!
	public static char opp = '_';
	
	//Variable to hold user input for Scanner
	public static String userStr;

	public static void main(String[] args) {
		
		//Greeting message for user of the game
		System.out.println ("Welcome to Tic Tac Toe!");
		
		// Run the setup method
		setup();
		
	}
	
	public static void drawBoard() {
		
		//Draw the game board
		System.out.println("\n\t    A   B   C");
		System.out.println("\t  .-----------.");
		System.out.println("\t1 |_"+TicTac.place[0]+"_|_"+TicTac.place[1]+"_|_"+TicTac.place[2]+"_|\n");
		System.out.println("\t2 |_"+TicTac.place[3]+"_|_"+TicTac.place[4]+"_|_"+TicTac.place[5]+"_|\n");
		System.out.println("\t3 |_"+TicTac.place[6]+"_|_"+TicTac.place[7]+"_|_"+TicTac.place[8]+"_|");
		System.out.println("\t  '-----------'");
		
	}
	
		public static void setup() {
			
			// Loop to reset the game board
			for (int i = 0; i < 9; i++){
				
				TicTac.place[i] = '_';
				
			}
			
			// Print the game board to the console
			drawBoard();
			
			while ((TicTac.team != 'X') && (TicTac.team != 'O') ){
				
				System.out.println("\n \nSelect your team! Enter 'X' or 'O' below to continue...");
				
				System.out.print("Enter your selection: ");
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				TicTac.userStr = input.next();
				
			if (TicTac.userStr.toUpperCase().equals("X")){
				
				TicTac.team = 'X';
				TicTac.opp = 'O';
				
			} else if (TicTac.userStr.toUpperCase().equals("O")){
				
				TicTac.team = 'O';
				TicTac.opp = 'X';
			} else {
				
				System.out.println("You entered: " + userStr);
				System.out.println("This is not a valid option.");
				System.out.println("Please enter either an X or an 0 to continue.");
				
			}
			
			
			
		}
			System.out.println("\nYou are team " + TicTac.team + "!");
			
			// Run the game method
			game();
			
	}
		
	public static void game() {
		
		// Local variable to run loop
		boolean loop = true;
		
		 System.out.println("It's your turn!");
		 
		 drawBoard();
		 
		 do {
			 
			 System.out.println("\n\nChoose a column and row to place an " + TicTac.team + ". (Example: A1)\n" );
			 
			 System.out.print("Enter your selection: ");
			 @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			 TicTac.userStr = input.next().toUpperCase();
			 
			 switch (TicTac.userStr)
				 {
				 case "A1" : if (TicTac.place[0]=='_'){
					 
					 TicTac.place[0] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in A1." );
					 oppMove();
					 loop = false;
					 
				 } else if (TicTac.place[0]==TicTac.team){
					 
					 System.out.println("\nThere is an " + TicTac.team + " there already!");
					 
				 } else if (TicTac.place[0]==TicTac.opp) {
					 
					 System.out.println("\nThere is an " + TicTac.opp + " there already!");
					 
				 }; break;
				 	 
				 
				case "B1" : if (TicTac.place[1]=='_'){
									 
					 TicTac.place[1] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in B1." );
					 oppMove();
					 loop = false;
									 
					} else if (TicTac.place[1]==TicTac.team){
									 
					System.out.println("\nThere is an " + TicTac.team + " there already!");
									 
					} else if (TicTac.place[1]==TicTac.opp) {
									 
					System.out.println("\nThere is an " + TicTac.opp + " there already!");
									 
					}; break;
				 
				 
				case "C1" : if (TicTac.place[2]=='_'){
					 
					 TicTac.place[2] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in C1." );
					 oppMove();
					 loop = false;
					 
				} else if (TicTac.place[2]==TicTac.team){
					 
					 System.out.println("\nThere is an " + TicTac.team + " there already!");
					 
				} else if (TicTac.place[2]==TicTac.opp) {
					 
					 System.out.println("\nThere is an " + TicTac.opp + " there already!");
					 
				}; break;


				case "A2" : if (TicTac.place[3]=='_'){
					 
					 TicTac.place[3] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in A2." );
					 oppMove();
					 loop = false;
					 
				} else if (TicTac.place[3]==TicTac.team){
					 
					 System.out.println("\nThere is an " + TicTac.team + " there already!");
					 
				} else if (TicTac.place[3]==TicTac.opp) {
					 
					 System.out.println("\nThere is an " + TicTac.opp + " there already!");
					 
				}; break;


				case "B2" : if (TicTac.place[4]=='_'){
					 
					 TicTac.place[4] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in B2." );
					 oppMove();
					 loop = false;
					 
				} else if (TicTac.place[4]==TicTac.team){
					 
					 System.out.println("\nThere is an " + TicTac.team + " there already!");
					 
				} else if (TicTac.place[4]==TicTac.opp) {
					 
					 System.out.println("\nThere is an " + TicTac.opp + " there already!");
					 
				}; break;


				case "C2" : if (TicTac.place[5]=='_'){
					 
					 TicTac.place[5] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in C2." );
					 oppMove();
					 loop = false;
					 
				} else if (TicTac.place[5]==TicTac.team){
					 
					 System.out.println("\nThere is an " + TicTac.team + " there already!");
					 
				} else if (TicTac.place[5]==TicTac.opp) {
					 
					 System.out.println("\nThere is an " + TicTac.opp + " there already!");
					 
				}; break;
				
				
				case "A3" : if (TicTac.place[6]=='_'){
					 
					 TicTac.place[6] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in A3." );
					 oppMove();
					 loop = false;
					 
				} else if (TicTac.place[6]==TicTac.team){
					 
					 System.out.println("\nThere is an " + TicTac.team + " there already!");
					 
				} else if (TicTac.place[6]==TicTac.opp) {
					 
					 System.out.println("\nThere is an " + TicTac.opp + " there already!");
					 
				}; break;
				
				
				case "B3" : if (TicTac.place[7]=='_'){
					 
					 TicTac.place[7] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in B3." );
					 oppMove();
					 loop = false;
					 
				} else if (TicTac.place[7]==TicTac.team){
					 
					 System.out.println("\nThere is an " + TicTac.team + " there already!");
					 
				} else if (TicTac.place[7]==TicTac.opp) {
					 
					 System.out.println("\nThere is an " + TicTac.opp + " there already!");
					 
				}; break;
				
				
				case "C3" : if (TicTac.place[8]=='_'){
					 
					 TicTac.place[8] = TicTac.team;
					 System.out.println("\n\nYou placed an " + TicTac.team + " in C3." );
					 oppMove();
					 loop = false;
					 
				} else if (TicTac.place[8]==TicTac.team){
					 
					 System.out.println("\nThere is an " + TicTac.team + " there already!");
					 
				} else if (TicTac.place[8]==TicTac.opp) {
					 
					 System.out.println("\nThere is an " + TicTac.opp + " there already!");
					 
				}; break;
				 
			}
			 
			 
		 } while (loop);
		 		 
		checkWin();
	}
	
	public static void  oppMove() {
		while (true) {
			
			if ((TicTac.place[0]=='_') || (TicTac.place[1]=='_') || (TicTac.place[2]=='_') || (TicTac.place[3]=='_') || (TicTac.place[4]=='_') || (TicTac.place[5]=='_') || (TicTac.place[6]=='_') || (TicTac.place[7]=='_') || (TicTac.place[8]=='_') ){
				float rn = (float) Math.random();
				float m = rn * 8;
				int x = Math.round(m);
				
				if (TicTac.place[x]=='_') {
					
					TicTac.place[x] = TicTac.opp;
					break;
				}
			} else { checkWin(); break; }
			
			}
		
		}
	
	public static void checkWin(){
		
		// See if X has won the game!
		
		if ( (TicTac.place[0]=='X') && (TicTac.place[1]=='X') && (TicTac.place[2]=='X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[3]=='X') && (TicTac.place[4]=='X') && (TicTac.place[5]=='X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[6]=='X') && (TicTac.place[7]=='X') && (TicTac.place[8]=='X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[0]=='X') && (TicTac.place[3]=='X') && (TicTac.place[6]=='X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[1]=='X') && (TicTac.place[4]=='X') && (TicTac.place[7]=='X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[2]=='X') && (TicTac.place[5]=='X') && (TicTac.place[8]=='X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[0]=='X') && (TicTac.place[4]=='X') && (TicTac.place[8]=='X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[6]=='X') && (TicTac.place[4]=='X') && (TicTac.place[2]=='X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
		}		
		// Now see if O has won the game!
		
if ( (TicTac.place[0]=='O') && (TicTac.place[1]=='O') && (TicTac.place[2]=='O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[3]=='O') && (TicTac.place[4]=='O') && (TicTac.place[5]=='O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[6]=='O') && (TicTac.place[7]=='O') && (TicTac.place[8]=='O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[0]=='O') && (TicTac.place[3]=='O') && (TicTac.place[6]=='O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[1]=='O') && (TicTac.place[4]=='O') && (TicTac.place[7]=='O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[2]=='O') && (TicTac.place[5]=='O') && (TicTac.place[8]=='O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[0]=='O') && (TicTac.place[4]=='O') && (TicTac.place[8]=='O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else if ( (TicTac.place[6]=='O') && (TicTac.place[4]=='O') && (TicTac.place[2]=='O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		// Check for a tie!	
			
		} else if ((TicTac.place[0]!='_') && (TicTac.place[1]!='_') && (TicTac.place[2]!='_') && (TicTac.place[3]!='_') && (TicTac.place[4]!='_') && (TicTac.place[5]!='_') && (TicTac.place[6]!='_') && (TicTac.place[7]!='_') && (TicTac.place[8]!='_')){
			
			
			System.out.println("\n\n\n\tTie Game!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
		
		// If no one has won the game and no tie has happened, keep on playing!!!

		} else { game(); }
			
	}
	
	@SuppressWarnings("resource")
		public static void  playAgain(){
		
				System.out.print("\n\nPlay again? [y/n]: " );
				Scanner input = new Scanner(System.in);
				TicTac.userStr = input.next().toLowerCase();
				
				if (userStr.equals("y")) {
					
					TicTac.team = '_';
					TicTac.opp = '_';
					setup();
					
				} else {
					
					System.exit(0);
				}
		}
	
}
