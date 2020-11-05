package collections.restaurant;

import java.util.Objects;


class MenuItem {
    private Integer mid;
    private String name;
    private Double price;
    private Integer quantity;
    
    public MenuItem () {       
    }
    
    public MenuItem (Integer mid, String name, Double price, Integer quantity) {
        this.mid = mid;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
   
    public Integer getmid() {
        return mid;
    }
    
    public void setmid(Integer mid) {
        this.mid = mid;
    }  

    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public Double getPrice() {
        return price;
    }

    
    public void setPrice(Double price) {
        this.price = price;
    }

    
    public Integer getQuantity() {
        return quantity;
    }

    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.mid);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.price);
        hash = 29 * hash + Objects.hashCode(this.quantity);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
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
