package Protoype;

public class MainTest {

    public static void main(String[] args) {

        Sheep original = new Sheep("Jolly", "Mountain Sheep");

        System.out.println(original.getName());
        System.out.println(original.getCategory());

        Sheep sheep = new Sheep(original);
        sheep.setName("Dolly");

        System.out.println(sheep.getName());
        System.out.println(sheep.getCategory());



    }
}
