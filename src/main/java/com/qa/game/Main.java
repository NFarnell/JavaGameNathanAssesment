package com.qa.game;
import java.util.Scanner;

public class Main {



	public static void main(String args[]) {
		

		
    	
		
        
        final int WIDTH = 5000;
        final int HEIGHT = 5000;
        Area[][] room = new Area[WIDTH][HEIGHT];
        Map.build(room, WIDTH, HEIGHT);                  // Code to create a big map using Areas array not infinite... but plz Chris it big
        int x = 2500;
        int y = 2500;
    
        
        // Title Screen
       
    	
        {
            Scanner readline = new Scanner(System.in);
            String jobName = "";
            String Name = "";
            System.out.println("What is your name adventurer?");
            Name = readline.nextLine();
            System.out.println(Name + " I've been stuck out here forever... the swamp... it just goes on forever!");
            System.out.println("---------------------------------------");
            System.out.println("Perhaps you can find a way out?");
            System.out.println("Or");
            System.out.println("Maybe you will die here too... hehehe");
            System.out.println("---------------------------------------");
            System.out.println("press Enter to continue...");
            jobName = readline.nextLine();
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("Where did that voice come from? Ah well what can ya do best find a way out!");
            System.out.println("Press any button to start your adventure");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            System.out.println("press Enter to continue...");
            jobName = readline.nextLine();
          
            
            System.out.println(Name + " Your adventure begins");
            jobName = readline.nextLine();
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("You are lost in a swamp, its dark, wet, cold and fills you with dread... every second you spend here drains at"
        		+ " your life.");
            System.out.println("Your magic compass points towards teleport scrolls and your map will tell you where you are");
            System.out.println("There may be hidden treasure around here, If I keep an eye out I might leave here rich! or dead! Who knows");
            System.out.println("Only a teleport scroll can save you now. Best get looking.");
            
        }

    	
    	
    	
    	// Print starting room description
    	Map.print(room, x, y );
   
    	

        // Start game loop
        boolean playing = true;
        while (playing) {

        	// Get user input
            String input = Input.getInput();

            // Movement commands
            if (input.equals("north")) {
                if (y > 0) {
                    y--;
                    Map.print(room, x, y);
                   
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("south")) {
                if (y < HEIGHT - 1) {
                    y++;
                    Map.print(room, x, y);
                  
                    
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("east")) {
                if (x > 0) {
                    x--;
                    Map.print(room, x, y);
                  
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("west")) {
                if (x < WIDTH - 1) {
                    x++;
                    Map.print(room, x, y);
             
                } else {
                    System.out.println("You can't go that way.");
                }
            }

           
            else if (input.equals("look")) {         //Repeats all the information of the area
                Map.print(room, x, y);
            }
            

            // All commands
            
            
            else if (input.equals("restart")) {
            	System.out.println();
            	Main.main(args);
            }

            
            
            else if (input.equals("help")) {
            	System.out.println("Type 'north'/'east'/'south'/'west' to move");
            	System.out.println("Type 'look' for a reminder of the area that you're in");
            	System.out.println("Type 'restart' to restart the game");
            	System.out.println("Type 'quit' to quit the game");
            }
            
            // Quit commands
            else if (input.equals("quit")) {
                System.out.println("Goodbye!");
                playing = false;

            // Catch-all for invalid input
            } else {
                System.out.println("You can't do that. Type help for a list of commands");
            }
        }
        System.exit(0);
    }
}
