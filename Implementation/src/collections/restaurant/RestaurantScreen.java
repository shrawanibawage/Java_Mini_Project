package collections.restaurant;

import java.util.List;
import java.util.Scanner;


public class RestaurantScreen {

    Order order = new Order();
    private int ch = 0;
    
    public RestaurantScreen () {
        menu();
    }
    
    public void mainScreen () {
    	System.out.println("***********************");
        System.out.println("1. Show Menu");
        System.out.println("***********************");
        System.out.println("2. Show My Order");
        System.out.println("***********************");
        System.out.println("3. Exit");
        System.out.println("***********************");
    }
    
    public void operationsMenu() {
    	System.out.println("***********************");
        System.out.println("1. Add to Order");
        System.out.println("***********************");
        System.out.println("2. Remove From Order");
        System.out.println("***********************");
        System.out.println("3. Exit");
        System.out.println("***********************");
    }
    
    public void menu () {
        do {
            mainScreen();
            takeInput();
            
            switch (ch) {
                case 1: 
                    displayMenu();
                    operationsMenu();
                    takeInput();
                    System.out.println("Choose Menu ID");
                    innerInput();
                    break;
                case 2:
                    showOrder();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    wrongChoice();
                    break;
            }
        } while (ch != 0);
    }
    
    private void wrongChoice() {
    	System.out.println("Incorrect Choice, Select Again");
    	
    }

    private void innerInput() {
        switch (ch) {
            case 1:
                addItem();
                showOrder();
                break;
            case 2:
                removeItem();
                break;
            default:
            	System.out.println("Incorrect Choice, Select Again");
                break;
        }
    }

    private int takeInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        //in.close();
        return ch;
       
    }

    private void displayMenu() {
        List<MenuItem> menuitems = new MenuItems().getMenuItems();
        System.out.println("M_ID----Item---------Price----Quantity");
        for (MenuItem ite: menuitems) {
            System.out.println(
                    ite.getmid() + "   ----" +
                            ite.getName() + "----" +
                            ite.getPrice() + "----" +
                            ite.getQuantity()
            );
        }
    }

    private void addItem() {
        int mid = takeInput();
        order.addItembymid(mid);      
    }

    private void showOrder() {
        order.printOrderItems();
    }

    private void removeItem() {
        int mid = takeInput();
        order.removeItemBymid(mid);
    }
}