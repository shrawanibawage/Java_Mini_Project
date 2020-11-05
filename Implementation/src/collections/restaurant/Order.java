package collections.restaurant;

import java.util.ArrayList;
import java.util.List;


class Order {

    List<MenuItem> orderItems = new ArrayList<MenuItem>();
    
    public void addItembymid(int mid) {
        MenuItem menuItem = getItemBymid(mid);
        addToOrder(menuItem);
    }

    private MenuItem getItemBymid(int mid) {
        MenuItem menuItem = null;
        List<MenuItem> menuItems = new MenuItems().getMenuItems();
        for (MenuItem ite: menuItems) {
            if (ite.getmid() == mid) {
                menuItem = ite;
                break;
            }
        }
        return menuItem;
    }

    private void addToOrder(MenuItem menuItem) {
        orderItems.add(menuItem);
    }

    public void removeItemBymid(int mid) {
    	MenuItem ite = getItemBymid(mid);
        orderItems.remove(ite);
    }

    void printOrderItems() {
        for (MenuItem ite: orderItems) {
            System.out.println(ite.getName());
        }
    }
    
}