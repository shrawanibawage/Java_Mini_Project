package collections.restmanage;

import java.util.Objects;


class MenuItem {
    private Integer mid;
    private String name;
    private Double price;
    private Integer quantity;
    
    public MenuItem () 
    {       
    }
    
    public MenuItem (Integer mid, String name, Double price, Integer quantity) 
    {
        this.mid = mid;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
   
    public Integer getmid() {                       //created getter method for mid function
        return mid;     
    }
    
    public void setmid(Integer mid) {               //created setter method for mid function
        this.mid = mid;
    }  

    public String getName() {                       //created getter method for name function
        return name;
    }

    
    public void setName(String name) {              //created setter method for name function
        this.name = name;
    }

    
    public Double getPrice() {                      //created getter method for price function
        return price;
    }

    
    public void setPrice(Double price) {            //created setter method for price function
        this.price = price;
    }

    
    public Integer getQuantity() {                  //created getter method for quantity function
        return quantity;
    }

    
    public void setQuantity(Integer quantity) {     //created setter method for quantity function
        this.quantity = quantity;
    }

    
    
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.mid);          //created unique hash code for pid
        hash = 29 * hash + Objects.hashCode(this.name);         //created unique hash code for name
        hash = 29 * hash + Objects.hashCode(this.price);        //created unique hash code for price
        hash = 29 * hash + Objects.hashCode(this.quantity);     //created unique hash code for quantity
        return hash;
    }

    @Override
    public boolean equals(Object obj) {                         //created equals function to compare two objects based on their properties
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MenuItem other = (MenuItem) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.mid, other.mid)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }
     
}
