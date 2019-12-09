package Builder;

public class MainTest {

    public static void main(String[] args) {

        BurgerBuilder b = new BurgerBuilder(14);
        b.addCheese();
        b.addLettuce();
        b.addPepperoni();
        b.addTomato();

        Burger burger = (b.build());
        }
    }
