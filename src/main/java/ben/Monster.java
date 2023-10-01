package ben;

import ben.Ben;

public class Monster extends Ben {
    private String name = "Monster";


    @Override
    public String characteristic() {

        return "Вы встретили нового " + name + "\n"
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


