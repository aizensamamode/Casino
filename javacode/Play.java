
package javacode;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Play {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    String[] fruits ={"🍉", "🍊", "🍓"};
    int player_bet;
    String player_Answer;
    


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
        System.out.println("Set your bet : ");
        player_bet = scan.nextInt();
    }

    void player_spin(){
        String first_Roll = fruits[random.nextInt(fruits.length)];
        String second_Roll = fruits[random.nextInt(fruits.length)];
        String third_Roll = fruits[random.nextInt(fruits.length)];
        System.out.println(first_Roll+"|"+second_Roll+"|"+third_Roll);
        
    }

    void player_menu(){
        System.out.println("TO SPIN       = [SPIN]");
        System.out.println("SET BET AGAIN = [BET]");
        System.out.println("TO BACK       = [BACK]");
        player_Answer = scan.nextLine();

        if (player_Answer.equalsIgnoreCase("spin")) {
            player_spin();
        }if (player_Answer.equalsIgnoreCase("back")) {
            System.out.println("go back");
        }if (player_Answer.equalsIgnoreCase("bet")) {
            set_player_Bet();
        }
    }


}
