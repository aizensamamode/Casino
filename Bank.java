import java.util.Scanner;
public class Bank {
    Scanner scan;
    String bankname = "Mark";
    int bankmoney   = 100;
    
    Bank(Scanner scan){
        this.scan = scan;
    }

    void bankshow1(){
        System.out.println("----------------------------");
        System.out.println("[BANK ACCOUNT]");
        System.out.println("[NAME : "+this.bankname+" ]");
        System.out.println("[MONEY: "+this.bankmoney+" ]");
        System.out.println("----------------------------");
        scan.nextLine();
        //AFTER HERE THERE SHOULD BE SCANNER WHEN USER PRESS ENTER IT PROCED TO NEXT
    }
}
