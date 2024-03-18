public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Item item1 = new Item("Lipstick", 1000);
        Item item2 = new Item("Shampoo", 2000);
        Item item3 = new Item("Mascara", 1500);

        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(item1, 10);
        shoppingBasket.addItem(item2, 15);
        shoppingBasket.addItem(item3, 10);

        shoppingBasket.showBasket();

        shoppingBasket.updateQuantity(item3, 20);
        shoppingBasket.showBasket();

        shoppingBasket.removeItem(item1);
        shoppingBasket.showBasket();

        shoppingBasket.calculateTotalPrice();
    }
}
