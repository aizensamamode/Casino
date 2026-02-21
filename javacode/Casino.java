package javacode;
import java.util.Scanner;
public class Casino {
    String Player_name;
    int casinoChips = 100;
    boolean for_bankpass = true;
    boolean for_namepass = false;
    private String answer;
    Bank bank; 
    Scanner scan;
  
    void getBank(Bank bank){
     this.bank = bank;
    }

    Casino(String Player_name){
        this.Player_name = Player_name;
    }

    void setscan( Scanner scan){
         this.scan = scan;
    }

    String get_answer(){
      return this.answer;
    }

    boolean get_bankpass(){
      return this.for_bankpass;
    }

    void casinomenu1(){
        if(!for_namepass){// will just run if for_namepass = false
        System.out.println("\n\n\n\n\n------------------------------");
        System.out.println("[WELCOME TO CASINO MENU 1]");
        System.out.println("ENTER YOUR NAME: ");
        this.answer = scan.nextLine();
        this.Player_name = answer;
        this.for_namepass = true;
        }
    }
    //------------------------------------------------------------
   void casinomenu2(){
    System.out.println("\n\n\n\n\n------------------------------");
    System.out.println("         [CASINOMENU1]        ");
    System.out.println("\n Payername: "+this.Player_name);
    System.out.println(" Player Money: " + this.casinoChips+"\n");
    System.out.println("TO WIDRAW  = [WIDRAW]");
    System.out.println("TO DEPOSIT = [DEPOSIT]");
    System.out.println("TO BACK    = [BACK]");
    System.out.println("TO PLAY    = [PLAY]");
    System.out.println("------------------------------");
    System.out.print("Answer : ");
    this.answer = scan.nextLine();
    }
    //---------------------------------------------------------------
    void answer_Casinomenu2(){ 
      
       if (answer.equalsIgnoreCase("back")) {
          System.out.println("----------------------------");
          System.out.println("END");
       }else if(answer.equalsIgnoreCase("WIDRAW")){
          widraw();
       }else if(answer.equalsIgnoreCase("deposit")){
          deposit();
       }else if(answer.equalsIgnoreCase("play")){
          System.out.println("play");
       }else{
        System.out.println("error");
       } 
      
    }
    //--------------------------------------------------------------
    void widraw(){
      System.out.println("How much do you want to widraw");
      int widraw = scan.nextInt();
      if(widraw <= casinoChips){
      bank.bankmoney += widraw;
      casinoChips -= widraw;
      System.out.println(casinoChips);
      }     
    }

    void deposit(){
      System.out.println("How much you want to deposit");
      int deposit = scan.nextInt();
      if(deposit <= bank.bankmoney){
         casinoChips += deposit;
         bank.bankmoney -= deposit;
         deposit = 0;
      }
      
    }
 
}
