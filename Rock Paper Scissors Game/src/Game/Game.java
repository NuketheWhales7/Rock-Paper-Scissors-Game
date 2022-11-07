package Game;

import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Rock Papper Scissors"); // Prints out Game to User
    System.out.println("Enter 1 for Rock"); // Prints out Game to User
    System.out.println("Enter 2 for Papper"); // Prints out Game to User
    System.out.println("Enter 3 for Scissors"); // Prints out Game to User
    System.out.println("Enter 4 to Quit"); // Prints out Game to User
    
    int Selection = scan.nextInt(); //Gets input from user as variable Selection
	int min = 1;
	int max = 3;
    Random random = new Random();
    int rand = random.nextInt(max + min) + min;
    

    if (Selection == 1)
    	if (rand ==3)
    		System.out.println("You Win!"); // Prints out Game to User
    	else if (rand ==2)
    		System.out.println("You Lose!"); // Prints out Game to User
    	else
    		System.out.println("Tie!"); // Prints out Game to User
    else if (Selection == 2)
    	if (rand ==1)
    		System.out.println("You Win!"); // Prints out Game to User
    	else if (rand ==3)
    		System.out.println("You Lose!"); // Prints out Game to User
    	else
    		System.out.println("Tie!"); // Prints out Game to User
    else if (Selection == 3)
    	if (rand ==2)
    		System.out.println("You Win!"); // Prints out Game to User
    	else if (rand ==1)
    		System.out.println("You Lose!"); // Prints out Game to User
    	else
    		System.out.println("Tie!"); // Prints out Game to User
    else return;
	}
    
}

