package app;

public class Espresso implements Drink {
    @Override
    public void prepare() {
        System.out.print("Your Espresso. Enjoy :)");
    }
}
