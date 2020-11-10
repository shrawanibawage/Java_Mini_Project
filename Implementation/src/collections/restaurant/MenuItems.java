package collections.restaurant;

import java.util.ArrayList;
import java.util.List;


public class MenuItems {
    private final List<MenuItem> MenuItems = new ArrayList<MenuItem>();     //object created

    public MenuItems () {                                                   //created MenuItems function which calls dataBase function to add menu items
        this.dataBase();
    }
    
    public List<MenuItem> getMenuItems() {                                  //return list of menu items
        return MenuItems;
    }
                                                                
    public void dataBase() {                                                //created database function to add item name, item price and item quantity into a new ArrayList of type MenuItem
        String [] MenuItemName = {"Fries", "Salad", "Papad Dry", "Papad Fry", "Masala Papad Fry", "Dry Papad Fry", "Veg Fried Rice", "Jeera Rice", "Ghee Rice", "Biryani Rice", 
                                 "Chicken Fried Rice", "Chicken Biryani", "Egg Fried Rice", "Paneer Butter Masala", "Mutter Paneer", "Shahi Paneer", "Tawa Chapati", 
                                  "Tandoori Butter Roti", "Plain Nan", "Onion Paratha", "Aloo Paratha"};
        Double [] MenuItemPrice = {40.00d, 65.00d, 10.00d, 10.00d, 20.00d, 20.00d, 60.00d, 60.00d, 70.00d, 50.00d, 110.00d, 100.00d, 70.00d, 150.00d, 150.00d, 150.00d, 20.00d, 30.00d, 10.00d, 50.00d, 60.00d};
        Integer [] MenuItemQuantity = {20, 10, 10, 15, 16, 20, 15, 5, 5, 10, 8, 9, 6, 10, 8, 9, 10, 11, 8, 4, 7};
        
        for (int i=0; i < MenuItemName.length; i++) {
            this.MenuItems.add(new MenuItem(i+1, MenuItemName[i], MenuItemPrice[i], MenuItemQuantity[i]));
        }
    }
}
