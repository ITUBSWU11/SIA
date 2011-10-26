package sia;

import java.util.ArrayList;

/**
 * A shop.
 * @author hypesystem
 */
public class Shop {
    private ArrayList<Item> items;
    
    public Shop() {
        items = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public Item takeItem(int index) {
        Item item = items.get(index);
        items.remove(index);
        return item;
    }
    
    public void removeItem(int index) {
        items.remove(index);
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
    
    
}
