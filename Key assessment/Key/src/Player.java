import java.util.Random;
public class Player {
    public String name;
    public int health = 20;

    public Player(String name){
        this.name = name;
        this.health = 20;
    }
    public void punch(Player player2) {
        Random rand = new Random();
        int pDamage = rand.nextInt(4);
        player2.health -= pDamage ;
        System.out.println(this.name + " punched " + player2.name + " for " + pDamage + " damage.");
        System.out.println(player2.name + " health is now " + player2.health);
    }
    public void kick(Player player2) {
            player2.health -= 2;
            System.out.println(this.name + " kicked " + player2.name + " for 2 damage.");
            System.out.println(player2.name + " health is now " + player2.health);

    }



}