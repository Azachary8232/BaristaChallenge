


public class Item {
    private String name;
    private double price;
}

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }


    //  getters
    public String getItemName(){
        return name;
    }
    public double getItemPrice(){
        return price;
    }

    // setters
    public void setItemName(String name){
        this.name = name;
    }
    public void setItemPrice(double price){
        this.price = price;
    }