package com.qa.game;
import java.util.ArrayList;

class Map {

    private static final String treasure = null;

	public static void build(Area[][] room, final int WIDTH, final int HEIGHT) {
    	
    	int d = 0;
    	

    	
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                room[i][j] = new Area(i, "", "", null);    //Room creation
            }
        }

        
        room[2515][2485].setDescription("You have found the scroll! Freedom is yours!");
        

        room[2500][2499].setDescription("You have stumbled across a treasure trove. Atleast you're gonna die rich");
        room[2500][2484].setDescription("You have stumbled across a treasure trove. Atleast you're gonna die rich");
        room[2450][2499].setDescription("You have stumbled across a treasure trove. Atleast you're gonna die rich");
        room[2520][2559].setDescription("You have stumbled across a treasure trove. Atleast you're gonna die rich");
        

        
    }

    public static void print(Area[][] room, int x, int y) {
    	 

        int Xdis = Math.abs(x - 2515);
        int Ydis = Math.abs(y - 2485);
       	
    	 

       
    int Dis = (Xdis * Xdis) + (Ydis * Ydis);
    
    int Distance = (int) Math.sqrt(Dis);
    
    int treasure = 0;
    	
    if (x == 2515 && y == 2485) {
   	 System.out.println(room[x][y].getDescription());
    }
    if (x == 2500 && y == 2499) {
    	treasure++;
    	System.out.println(room[x][y].getDescription());
    	System.out.println("Pieces of treasure collected:" + treasure + "/4");
    }
    
    if (x == 2500 && y == 2484) {
    	treasure = treasure++;
   	System.out.println(room[x][y].getDescription());
    	System.out.println("Pieces of treasure collected:" + treasure + "/4");
    }
    
    if (x == 2450 && y == 2499) {
    	treasure++;
   	System.out.println(room[x][y].getDescription());
    	System.out.println("Pieces of treasure collected:" + treasure + "/4");
    }
    if (x == 2520 && y == 2559) {
    	treasure++;
   	System.out.println(room[x][y].getDescription());
    	System.out.println("Pieces of treasure collected:" + treasure + "/4");
    }
    
   	   
   	if (x != 2515 && y != 2485) {
   		 System.out.println("I'm still lost in this darn swamp! Best find that teleport scroll! You know before I die... Or whatever");
   		 System.out.println("Thank goodness my compass still works. Which way will I go north,east,south or west?");
   	 }
   	 if (Distance > 5 && Distance < 10) {
        System.out.println("Your hand can barely hold the compass, it must be around here somewhere");
    }
       
    
        
    if   (Distance > 10 && Distance < 50) { 
    	System.out.println("Your compass pulses with energy! You must be close");
    }
   	
    if   (Distance > 50 && Distance < 100) { 
    	System.out.println("You are drifting away from the scroll");
    }
   if   (Distance > 100 && Distance < 200) { 
    	System.out.println("You are definitely going the wrong way");
    }
        
   
   if   (Distance >200 ) { 
   	System.out.println("Give up you're gonna die out here");
   }
    	System.out.println("Your x coordinate:" + x);
    	System.out.println("Your y coordinate:" + y);
    }


}

class Area {


  
    private String description;


	

    public Area(int number, String name, String description,
            ArrayList<String> items) {
    }




    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    
    






}

