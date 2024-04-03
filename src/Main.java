import java.util.*;

public class Main {
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("Harry", 150);
        Wizard wizard2 = new Wizard("Ron", 150);
        Wizard wizard3 = new Wizard("Hermini", 450);
        Wizard wizard4 = new Wizard("Dambldor", 1500);


        wizard1.makeSpell("Imperio", 100);
        wizard1.makeSpell("Imperio", 100);
        wizard1.rest(50);
        wizard1.makeSpell("Imperio", 100);


        //wizard4.makeSpell("Avada Kedavra", 1000);

        //wizard2.makeSpell("Recktumsepra", 30);

    }
}

class Wizard {
    String name;
    int energyLevel;

    public Wizard(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    public void makeSpell(String command, int wasteEnergy) {
        List<String> bookOfSpell = Arrays.asList (new String[]{"Imperio","Allahamora", "Accio", "Avada Kedavra"});
        if (energyLevel >= wasteEnergy) {
            if (bookOfSpell.contains(command))
            {

                if (command == "Imperio") {
                    System.out.println("Заклинание выполнено успешно.Теперь вы управляете этим персонажем");
                    energyLevel -= wasteEnergy;
                }
                if ((command == "Allahamora")) {
                    System.out.println("Заклинание выполнено успешно. Вы открыли замок");
                    energyLevel -= wasteEnergy;
                }

                if ((command == "Accio")) {
                    System.out.println("Заклинание выполнено успешно. Вы  нашли предмет");
                    energyLevel -= wasteEnergy;
                }

                if ((command == "Avada Kedavra")) {
                    System.out.println("Заклинание выполнено успешно. Вы убили Того-Кого-Нельзя-Называть");
                    energyLevel -= wasteEnergy;
                }}
            else
                System.out.println("Неправильно введено заклинание");

        } else
            System.out.println("Пшик. Недостаточно энергии. Отдохните");
    }

    public int rest ( int hours){
        energyLevel += hours;
        return energyLevel;
    }

}