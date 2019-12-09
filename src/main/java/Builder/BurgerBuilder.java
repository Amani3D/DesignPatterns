package Builder;

public class BurgerBuilder {

    public int size;

    public boolean cheese;
    public boolean pepperoni;
    public boolean lettuce;
    public boolean tomato;

    public BurgerBuilder(int size) {
        this.size = size;
    }

    public boolean addPepperoni() {
       return this.pepperoni = true;
    }

    public boolean addLettuce() {
        return this.lettuce = true;
    }

    public boolean addCheese() {
        return this.cheese = true;
    }

    public boolean addTomato() {
        return this.tomato = true;
    }

    public Burger build() {
        return new Burger(this);
    }
}
