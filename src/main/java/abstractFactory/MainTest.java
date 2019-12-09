package abstractFactory;

public class MainTest {

    public static void main(String[] args) {

        WoodenDoorFactory woodenFactory = new WoodenDoorFactory();

        Door door = woodenFactory.makeDoor();
        DoorFittingExpert expert = woodenFactory.makeFittingExpert();
        door.getDescription();
        expert.getDescription();

        IronDoorFactory ironFactory = new IronDoorFactory();

        Door door1 = ironFactory.makeDoor();
        DoorFittingExpert expert1 = ironFactory.makeFittingExpert();
        door1.getDescription();
        expert1.getDescription();
    }
}
