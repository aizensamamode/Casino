import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Bank bank = new Bank(scan);
    
    bank.bankshow1(); 
    /* PROBLEM 1. WE NEED TO JUST CREATE ONE SCANNER AND USE IT IN EVERY CLASS
     FIX THIS PROBLEM */ 
     System.out.println("problem");
     scan.close();

    }
}
