import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name Player 1");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Please enter your name Player 2");
        Player player2 = new Player(scanner.nextLine());

        Player[] players = {player1, player2};
        int currentPlayerIndex = 0;

        while(players[0].health > 0 && 0 < players[1].health) {
            Player currentPlayer = players[currentPlayerIndex];
            Player opponent = players[1 - currentPlayerIndex];
            System.out.println(currentPlayer.name + " it is your turn.");
            System.out.println("Please select 'p' to punch or 'k' to kick");
            String fight = scanner.nextLine();

            while (!fight.equalsIgnoreCase("p") && (!fight.equalsIgnoreCase("k"))) {
                System.out.println("Please select either 'p' to punch or 'k' to kick");
                fight = scanner.nextLine();
            }

            if (fight.equalsIgnoreCase("p")) {
                currentPlayer.punch(opponent);
            } else {
                currentPlayer.kick(opponent);
            }

            if(opponent.health == 0){
                System.out.println(currentPlayer.name + " is the winner");
            }

            currentPlayerIndex = 1 - currentPlayerIndex;
        }
    }


}