public class Cafe implements CoffeMachine{
    private int  price;
    String  cook;

    @Override
    public void americano() {
        price = 10;
        cook = "Cook americano";
        System.out.println("Price: " + price + "$, " + cook);
    }

    @Override
    public void latte() {
        price = 20;
        cook = "Cook latte";
        System.out.println("Price: " + price + "$, " + cook);
    }

    @Override
    public void cappuccino() {
        price = 15;
        cook = "Cook cappuccino";
        System.out.println("Price: " + price + "$, " + cook);
    }

    @Override
    public void tea() {
        price = 5;
        cook = "Cook tea";
        System.out.println("Price: " + price + "$, " + cook);
    }

    public int getPrice() {
        return price;
    }
}
