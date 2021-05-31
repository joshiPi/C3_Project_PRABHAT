import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<Item> orderItems = new ArrayList<>();
    //order total should be private so no other methods can change it's value.
    private int orderTotal=0;

    public void addItemToOrder(Item item){
        orderItems.add(item);
    }

    public List<Item> getOrderItems(){
        return this.orderItems;
    }

    public int getOrderTotal(List<Item> orderItems){
        for (Item item: orderItems)
            orderTotal+=item.getPrice();
        return orderTotal;
        }
    }
