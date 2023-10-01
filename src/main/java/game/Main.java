package game;


import ben.Ben;
import ben.Monster;
import ben.Player;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Ben player = new Player();
        Ben monster = new Monster();

        System.out.println(monster.characteristic());
        System.out.println(player.characteristic());

        Game.attack(player, monster);
    }
}
