package Command;

public class Main {

    public static void main(String[] args) {
        Сontroller controller = new Сontroller("К64");
        Operator operator = new Operator("Менеджер Макаренко С.Е.");

        operator.writeCommand(controller.giveTheCommand());
        operator.writeCommand(controller.giveTheCommand());

    }

}
