package Singleton;

public class MainTest {

    public static void main(String[] args) {

        President president = new President().getInstance();

        President president1 = new President().getInstance();

        System.out.println(president == president1);
    }
}
