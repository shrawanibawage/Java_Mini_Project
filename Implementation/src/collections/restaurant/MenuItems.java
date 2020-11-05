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
        String [] MenuItemName = {"Lux Soap", "Fair n Lovely", "MTR"};
        Double [] MenuItemPrice = {40.00d, 60.00d, 30.00d};
        Integer [] MenuItemQuantity = {10, 6, 10};
        
        for (int i=0; i < MenuItemName.length; i++) {
            this.MenuItems.add(new MenuItem(i+1, MenuItemName[i], MenuItemPrice[i], MenuItemQuantity[i]));
        }
    }
}