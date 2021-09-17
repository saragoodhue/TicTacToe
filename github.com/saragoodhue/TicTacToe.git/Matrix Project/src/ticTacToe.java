import java.util.Scanner;
import java.util.Random;

public class ticTacToe
	{
		static String[][] ticTacToe = new String[3][3];

		public static void main(String[] args)
			{	
				fillGrid();
				displayGrid();
				
				System.out.println("I love github");
				
				while(!gameIsWon()) 
					{
						userInput();
						computerMove();
						displayGrid();
						gameIsWon();
					}
			}

		public static void displayGrid()
			{
				System.out.println("    1   2   3");
				System.out.println("  -------------");
				System.out.println("A | " + ticTacToe[0][0] + " | " + ticTacToe[0][1] + " | " + ticTacToe[0][2] + " |");
				System.out.println("  -------------");
				System.out.println("B | " + ticTacToe[1][0] + " | " + ticTacToe[1][1] + " | " + ticTacToe[1][2] + " |");
				System.out.println("  -------------");
				System.out.println("C | " + ticTacToe[2][0] + " | " + ticTacToe[2][1] + " | " + ticTacToe[2][2] + " |");
				System.out.println("  -------------");
			}

		public static void fillGrid()
			{
				for (int row = 0; row < ticTacToe.length; row++)
					{
						for (int col = 0; col < ticTacToe.length; col++)
							{
								ticTacToe[row][col] = " ";
							}
					}

			}

		public static void userInput()
			{
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Enter the location of where you want to make your move:");
				String coordinate = userStringInput.nextLine();

				if (coordinate.equals("A1"))
					{
						if(ticTacToe[0][0].equals(" "))
							{
								ticTacToe[0][0] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[0][0] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					} 
				else if (coordinate.equals("A2"))
					{
						if(ticTacToe[0][1].equals(" "))
							{
								ticTacToe[0][1] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[0][1] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					} 
				else if (coordinate.equals("A3"))
					{
						if(ticTacToe[0][2].equals(" "))
							{
								ticTacToe[0][2] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[0][2] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					} 
				else if (coordinate.equals("B1"))
					{
						if(ticTacToe[1][0].equals(" "))
							{
								ticTacToe[1][0] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[1][0] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					} 
				else if (coordinate.equals("B2"))
					{
						if(ticTacToe[1][1].equals(" "))
							{
								ticTacToe[1][1] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[1][1] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					} 
				else if (coordinate.equals("B3"))
					{
						if(ticTacToe[1][2].equals(" "))
							{
								ticTacToe[1][2] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[1][2] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					} 
				else if (coordinate.equals("C1"))
					{
						if(ticTacToe[2][0].equals(" "))
							{
								ticTacToe[2][0] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[2][0] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					} 
				else if (coordinate.equals("C2"))
					{
						if(ticTacToe[2][1].equals(" "))
							{
								ticTacToe[2][1] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[2][1] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					} 
				else if (coordinate.equals("C3"))
					{
						if(ticTacToe[2][2].equals(" "))
							{
								ticTacToe[2][2] = "X";
								displayGrid();
							}
						
						else if(!(ticTacToe[2][2] == " "))
							{
								System.out.println("That spot is already taken! Try again.");
								userInput();
								computerMove();
							}
					}				
			}

		public static void computerMove()
			{
				Random compRow = new Random();
				Random compCol = new Random();
				int upperbound = 3;
				int rowRandom = compRow.nextInt(upperbound);
				int colRandom = compCol.nextInt(upperbound);
				
				if(ticTacToe[rowRandom][colRandom] == " ")
					{
						ticTacToe[rowRandom][colRandom] = "O";
					}

			}
	
		public static boolean gameIsWon()
			{
				if ((ticTacToe[0][0].equals(ticTacToe[0][1]) && ticTacToe[0][1].equals(ticTacToe[0][2]) && !ticTacToe[0][1].equals(" ")) ||
						(ticTacToe[1][0].equals(ticTacToe[1][1]) && ticTacToe[1][1].equals(ticTacToe[1][2]) && !ticTacToe[1][1].equals(" ")) ||
						(ticTacToe[2][0].equals(ticTacToe[2][1]) && ticTacToe[2][1].equals(ticTacToe[2][2]) && !ticTacToe[2][1].equals(" ")) ||
						(ticTacToe[0][0].equals(ticTacToe[1][0]) && ticTacToe[1][0].equals(ticTacToe[2][0]) && !ticTacToe[1][0].equals(" ")) ||				
						(ticTacToe[0][1].equals(ticTacToe[1][1]) && ticTacToe[1][1].equals(ticTacToe[2][1]) && !ticTacToe[1][1].equals(" ")) ||
						(ticTacToe[0][2].equals(ticTacToe[1][2]) && ticTacToe[1][2].equals(ticTacToe[2][2]) && !ticTacToe[1][2].equals(" ")) ||
						(ticTacToe[0][0].equals(ticTacToe[1][1]) && ticTacToe[1][1].equals(ticTacToe[2][2]) && !ticTacToe[1][1].equals(" ")) ||
						(ticTacToe[0][2].equals(ticTacToe[1][1]) && ticTacToe[1][1].equals(ticTacToe[2][0]) && !ticTacToe[1][1].equals(" ")))
							{
								System.out.println("The game is over!");
								System.exit(0);
								return true;
							}
					return false;
			}
	
	}
	
