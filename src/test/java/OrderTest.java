// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


public class OrderTest {
    Order order;
    Item item1;
    Item item2;

    @BeforeEach
    public void setup(){
        order = new Order();
        item1 = new Item("Sweet corn soup",20);
        item2 = new Item("Sour corn soup",30);
    }
    
    @Test
    public void adding_item_to_order_should_increase_orderItem_size_by_1(){
        int initialOrderItemSize = order.getOrderItems().size();
        order.addItemToOrder(item1);
        assertEquals(initialOrderItemSize+1,order.getOrderItems().size());
    }

    @Test
    public void when_get_total_order_is_called_correct_total_order_value_should_be_returned(){
        order.addItemToOrder(item1);
        order.addItemToOrder(item2);
        int totalOrder = order.getOrderTotal(order.getOrderItems());
        assertEquals(50, totalOrder);

    }
}
