import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ShoppingBasket {

    private final HashMap<Item, Integer> basket;

    public ShoppingBasket(){
        this.basket = new HashMap<>();
    }

    //для добавления товара и его количества в корзину.
    public void addItem(Item item, int quantity) {
        System.out.println("added item : " + item.title);
        this.basket.put(item, quantity);
    }

    //для удаления товара из корзины.
    public void removeItem(Item item) {
        System.out.println("deleted item : " + item.title);
        this.basket.remove(item);
    }

    //для обновления количества товара в корзине.
    public void updateQuantity(Item item, int quantity) {
        System.out.println("updated item : " + item.title);
        this.basket.put(item, quantity);
    }

    //для расчета общей стоимости товаров в корзине
    public void calculateTotalPrice() {
        Set<Item> keys = basket.keySet();
        ArrayList<Integer> values = new ArrayList<>(basket.values());

        int i = 0;
        for (Item key: keys){
            System.out.println(key.title + " : " + key.price * values.get(i));
            i++;
        }
    }

    public void showBasket(){
        Set<Item> keys = basket.keySet();
        ArrayList<Integer> values = new ArrayList<>(basket.values());
        int i = 0;
        for (Item key: keys){
            System.out.println(key.title + ": " + key.price + " = " + values.get(i));
            i++;
        }
    }
}
