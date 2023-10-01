package ben;

import java.util.Random;

public abstract class Ben {
    protected String name;
    protected int attack;
    protected int defense;
    protected int health;
    protected int damage;

    public String characteristic() {
        return "\n" + "Вы создали нового " + name + "\n"
                + "Его характеристики :\n" +
                "Атака: " + attack + "\n" +
                "Защита: " + defense + "\n" +
                "Дамаг: " + damage + "\n" +
                "Здоровье: " + health;
    }

    public Ben() {
        attack = new Random().nextInt(30) + 1;
        defense = new Random().nextInt(30) + 1;
        health = new Random().nextInt(Integer.MAX_VALUE) + 1;
        damage = new Random().nextInt(Integer.MAX_VALUE) + 1;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
