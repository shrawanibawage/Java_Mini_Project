package collections.restaurant;

import java.util.ArrayList;
import java.util.List;


public class MenuItems {
    private final List<MenuItem> MenuItems = new ArrayList<MenuItem>();

    public MenuItems () {
        this.dataBase();
    }
    
    public List<MenuItem> getMenuItems() {
        return MenuItems;
    }
    
    public void dataBase() {
        String [] MenuItemName = {"Fries", "Salad", "Papad Dry", "Papad Fry", "Masala Papad Fry", "Dry Papad Fry"};
        Double [] MenuItemPrice = {40.00d, 65.00d, 10.00d, 10.00d, 20.00d, 20.00d};
        Integer [] MenuItemQuantity = {20, 10, 10, 15, 16, 20};
        
        for (int i=0; i < MenuItemName.length; i++) {
            this.MenuItems.add(new MenuItem(i+1, MenuItemName[i], MenuItemPrice[i], MenuItemQuantity[i]));
        }
    }
}
