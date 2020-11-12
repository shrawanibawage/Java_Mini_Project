package collections.restmanage;

import java.util.ArrayList;
import java.util.List;


class Order {

    List<MenuItem> orderItems = new ArrayList<MenuItem>();                  //object created
    
    public void addItembymid(int mid) {                                     //to add a new item into order list
        MenuItem menuItem = getItemBymid(mid);
        addToOrder(menuItem);
    }

    private MenuItem getItemBymid(int mid) {                                //searching items with mid
        MenuItem menuItem = null;
        List<MenuItem> menuItems = new MenuItems().getMenuItems();
        for (MenuItem ite: menuItems) {
            if (ite.getmid() == mid) {
                menuItem = ite;
                break;
            }
        }
        return menItem;
    }

    private void addToOrder(MenuItem menuItem) {                            //adding a new item into menuItem
        orderItems.add(menuItem);
    }

    public void removeItemBymid(int mid) {                                  //removing item from menuItem
    	MenuItem ite = getItemBymid(mid);
        orderItems.remove(ite);
    }

    void printOrderItems() {                                                //printing the list of items 
        for (MenuItem ite: orderItems) {
            System.out.println(ite.getName());
        }
    }
    
}

