package javacode;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) { 
    Scanner scanl = new Scanner(System.in);
    Bank bank = new Bank();
    String player_name = bank.Player_name();
    Casino casino = new Casino(player_name);
    Play play = new Play();
    
    int play_casinochips;
    int casino_casinochips;

    casino.getBank(bank);  //connect casino object here to casino
    bank.setscan(scanl);  // connect the bank scanner in the main scanner  scanl
    casino.setscan(scanl); // connect the casino scanner in the main scanner scanl

    while(casino.get_bankpass()){
    
    play.getCasinoChips(casino.casinoChips);
    
    bank.bankshow1(); //method 1 first to show when the program run after pressing enter should go to 
    //casinomenu1
    casino.casinomenu1(); // create new name and save it


    casino.casinomenu2(); // [casino menu 2 after player enter name] 
    casino.answer_Casinomenu2();
    }
    //end
    scanl.close();
    }
}
