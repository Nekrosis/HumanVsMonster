package game;

import ben.Ben;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Game {

    private static int healthMax;

    private static int attackModifier(int attack, int defense) {
        int result = attack - defense + 1;

        if (result <= 0) {
            return 1;
        }
        return attack - defense + 1;
    }

    private static boolean cubs(int count) {
        for (int i = 0; i < count; i++) {
            int number = new Random().nextInt(6) + 1;

            if (number == 6 || number == 5) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void attack(Ben player, Ben monster) throws InterruptedException {
        healthMax = player.getHealth();
        int playerMod = attackModifier(player.getAttack(), monster.getDefense());
        int monsterMod = attackModifier(monster.getAttack(), player.getDefense());
        while (monster.getHealth() > 0 && player.getHealth() > 0) {

            if (cubs(playerMod)) {
                monster.setHealth(monster.getHealth() - new Random().nextInt(player.getDamage()));
                System.out.println("У монстра осталось здоровья - " + monster.getHealth());
                sleep(1000);
            }

            if (monster.getHealth() <= 0 || player.getHealth() <= 0) {
                break;
            }

            if (cubs(monsterMod)) {
                player.setHealth(player.getHealth() - new Random().nextInt(monster.getDamage()));
                System.out.println("У игрока осталось здоровья - " + player.getHealth());
                hp(player);
                sleep(1000);
            }
        }

        if (monster.getHealth() <= 0) {
            System.out.println("Победил " + player.getName());
        } else if (player.getHealth() <= 0) {
            System.out.println("Победил " + monster.getName());
        }
    }

    private static void hp(Ben player) {
        healthMax = player.getHealth();
        if (player.getHealth() <= healthMax * 0.50) {
            for (int count = 4; count > 0; ) {
                if (player.getHealth() + healthMax * 0.30 <= healthMax) {
                    player.setHealth((int) (player.getHealth() + healthMax * 0.30));
                    count--;
                    System.out.println("Player reset hp");
                } else {
                    player.setHealth(healthMax);
                    System.out.println("Player reset hp");
                    count--;
                }
            }
        }
    }
}
