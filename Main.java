import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
   
    String casinomenu2;
    Scanner scanl = new Scanner(System.in);
    Bank bank = new Bank();
    
    String player_name = bank.Player_name();

    Casino casino = new Casino(player_name);
    
    bank.setscan(scanl);  // connect the bank scanner in the main scanner  scanl
    casino.setscan(scanl); // connect the casino scanner in the main scanner scanl

    do {      // to return to bank show if user enter back
    
        bank.bankshow1(); //method 1 first to show when the program run after pressing enter should go to 
    //casinomenu1



    casino.casinomenu1(); // create new name and save it
    casinomenu2 = casino.casinomenu2(); // [casino menu 2 after player enter name]
    
    casino.answer_Casinomenu2(casinomenu2);

    }while(casino.for_bankpass);

    


    
 




    //end
    scanl.close();

    }
}
