import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }


}

class Checker implements Comparator<Player> {
    public int compare(Player player1, Player player2) {
          if (player1.score == player2.score) {
              return player1.name.compareTo(player2.name);
          } else {
              return player2.score - player1.score;
          }
    }
}
public class Asm2_Comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players: ");
        int numberOfPlayer = sc.nextInt();

        Player[] player = new Player[numberOfPlayer];
        Checker checker = new Checker();

        for (int i = 0; i < numberOfPlayer; i++) {
            player[i] = new Player(sc.next(), sc.nextInt());
        }

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }


    }
}
