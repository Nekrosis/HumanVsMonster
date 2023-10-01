package game;

public class Player extends Ben {
    private String name = "Player";

    @Override
    public String characteristic() {

        return "Вы создали нового " + name + "\n"
                + "Его характеристики:\n" +
                "Атака: " + attack + "\n" +
                "Защита: " + defense + "\n" +
                "Дамаг: " + damage + "\n" +
                "Здоровье: " + health + "\n";
    }

    public String getName() {
        return name;
    }
}
