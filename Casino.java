import java.util.Scanner;
public class Casino {
    String Player_name;
    int Player_money;
    boolean for_bankpass = false;
    boolean for_namepass = false;
    Scanner scan;

    Casino(String Player_name){
        this.Player_name = Player_name;
        
    }

    void setscan( Scanner scan){
         this.scan = scan;
    }

    void casinomenu1(){
        if(!for_namepass){
        System.out.println("\n\n\n\n\n------------------------------");
        System.out.println("[WELCOME TO CASINO MENU 1]");
        System.out.println("ENTER YOUR NAME: ");
        String name = scan.nextLine();
        this.Player_name = name;
        this.for_namepass = true;
        }else{

        }
    }

    String casinomenu2(){
    System.out.println("\n\n\n\n\n------------------------------");
    System.out.println("         [CASINOMENU1]        ");
    System.out.println("\n Payername: "+this.Player_name);
    System.out.println(" Player Money: " + this.Player_money+"\n");
    System.out.println("TO WIDRAW = [WIDRAW]");
    System.out.println("TO DEPOSIT = [DEPOSIT]");
    System.out.println("TO BACK = [BACK]");
    System.out.println("------------------------------");
    System.out.print("Answer : ");
    String answer_Casinomenu2 = scan.nextLine();
    return answer_Casinomenu2;
    }


    //---------------------------------------------------------------
    void answer_Casinomenu2(String ans){
       if (ans.equalsIgnoreCase("back")) {
          this.for_bankpass = true;
          System.out.println("----------------------------");
          System.out.println("END");
          
       }else if(ans.equalsIgnoreCase("WIDRAW")){
          System.out.println("WIDRAW");
       }else if(ans.equalsIgnoreCase("deposit")){
          System.out.println("Deposit");
       }else if(ans.equalsIgnoreCase("play")){
          System.out.println("play");
       }else{
        System.out.println("error");
       }
    }

    
}
