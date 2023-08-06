package Command;

import java.util.ArrayList;
import java.util.List;

public class Сontroller {
    String name;
    List<Command> сommandList;

    public Сontroller(String name) {
        this.name = name;
    }

    String[] objectsEquipment = new String[]{"Фундамент", "Стройплощадка", "Дом"};
    String[] actionsEquipment = new String[]{"Заливка", "Постановка", "Разгрузка", "Полировка", "Отправка"};



    public Command giveTheCommand(){
        сommandList = new ArrayList<>();
        сommandList.add(new ConstructionCommand(objectsEquipment[0], actionsEquipment[0]));
        сommandList.add(new ConstructionCommand(objectsEquipment[1], actionsEquipment[4]));
        сommandList.add(new ConstructionCommand(objectsEquipment[2], actionsEquipment[2]));
        return null;

    }

}
