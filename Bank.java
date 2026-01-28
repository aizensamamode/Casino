import java.util.Scanner;
public class Bank {
    Scanner scan; // set no value but after the constructor is called it will now set to a object
    String bankname = "Mark";
    int bankmoney   = 100;
    
    /*
    Bank(Scanner scan){
        this.scan = scan;  // the value of scanner in the main will be passed to this scan

     //--we can use this anytime
    }
    */

    void setscan(Scanner scan){
        this.scan = scan;
    }
    
    void bankshow1(){
        System.out.println("\n\n\n\n\n----------------------------");
        System.out.println("[BANK ACCOUNT]");
        System.out.println("[NAME : "+this.bankname+" ]");
        System.out.println("[MONEY: "+this.bankmoney+" ]");
        System.out.println("----------------------------");
        String halo = scan.nextLine();
              
        //AFTER HERE THERE SHOULD BE SCANNER WHEN USER PRESS ENTER IT PROCED TO NEXT
    } 
    
    
    //---------------------------------------------------------------------
    //for Casino pass the player_name and not include the money cause we need him to widraw to play
  
    String Player_name(){  // method to return player name
        return this.bankname;
    }
}
