
package javacode;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Play {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    String[] fruits ={"🍉", "🍊", "🍓"};
    int jackpot;
    int player_bet;
    int casinoChips = 100;
    String player_Answer = "back";

    void run_all(){
        game_Start();
        set_player_Bet();
        player_menu();
    }
    

    int multiplyer(int index_get){
        jackpot = 0;
        jackpot = player_bet;
        if(index_get == 0){//multiply 20x
           jackpot *= 20;
           casinoChips += jackpot;
        }
        if(index_get == 1){//multiply 10x
           jackpot *= 10;
           casinoChips += jackpot;
        }
        if(index_get == 2){//multiply 5x
           jackpot *= 5;
           casinoChips += jackpot;
        }
        return jackpot;
    }


    void game_Start (){
        System.out.println("[WELCOME TO THE GAME]");
        System.out.println("WIN IF ALL THREE SET ARE SHOWN");
        System.out.println("🍉| 🍉 | 🍉 = x 20");
        System.out.println("🍊| 🍊 | 🍊 = x 5");
        System.out.println("🍓| 🍓 | 🍓 = x 3");
        System.out.println("[PRESS ENTER TO START]");
        scan.nextLine();
    }

    void set_player_Bet (){
        System.out.println("\nSet your bet : ");
        player_bet = scan.nextInt();
        scan.nextLine();
        player_menu();
    }

    void player_spin(){
        do{
            if (casinoChips <= 0) {
                System.out.println("YOU ARE OUT OF MONEY");
                player_menu();
            }
        int index_firstroll = random.nextInt(fruits.length);
        int index_secondroll= random.nextInt(fruits.length);
        int index_thirdroll= random.nextInt(fruits.length);

        String first_Roll = fruits[index_firstroll];
        String second_Roll = fruits[index_secondroll];
        String third_Roll = fruits[index_thirdroll];

        System.out.println(first_Roll+"|"+second_Roll+"|"+third_Roll);
        
        if(index_firstroll == 0 && index_secondroll == 0 && index_thirdroll == 0 ){
           multiplyer(index_firstroll);
           System.out.println("You win "+jackpot);
        }
        if(index_firstroll == 1 && index_secondroll == 1 && index_thirdroll == 1 ){
            multiplyer(index_firstroll);
            System.out.println("You win "+jackpot);
        }
        if(index_firstroll == 2 && index_secondroll == 2 && index_thirdroll == 2 ){
            multiplyer(index_firstroll);
            System.out.println("You win "+jackpot);
        }else{
            casinoChips -= player_bet;
            System.out.println("you lose | -"+player_bet+" |");
        }
        System.out.println("MONEY : "+casinoChips+" BET : "+player_bet);
        System.out.println("PRESS [ENTER] TO SPIN AGAIN | [BACK] TO BACK");
        player_Answer = scan.nextLine();
        if (player_Answer.equalsIgnoreCase("back")) {
            player_menu();
        }
        }while(!player_Answer.equalsIgnoreCase("back")||player_bet == 0);

    }

    void player_menu(){

        System.out.println("\n\nCASINO CHIPS :" +casinoChips);
        System.out.println("TO SPIN       = [SPIN]");
        System.out.println("SET BET AGAIN = [BET]");
        System.out.println("TO BACK       = [BACK]");
        player_Answer = scan.nextLine();

        if (player_Answer.equalsIgnoreCase("spin")) {
            player_spin();
        }if (player_Answer.equalsIgnoreCase("back")) {
            System.out.println("THE END");
            System.exit(0);
        }if (player_Answer.equalsIgnoreCase("bet")) {
            set_player_Bet();
        }   
        
    }


}
