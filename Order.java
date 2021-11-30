import java.util.ArrayList;


public class Order{

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

}

    public Order(){
        this.name = "Guest";
        items.clear();
    }

    public Order(String name){
        this.name = name;
    }


    //  getters
    public String getOrderName(){
        return this.name;
    }
    public boolean getOrderReady(){
        return this.ready;
    }
    public ArrayList<Item> getOrderItems(){
        return this.items;
    }

    //  setters
    public void setOrderName(String name){
        this.name = name;
    }
    public void setOrderReady(boolean ready){
        this.ready = ready;
    }
    public void setOrderItems(ArrayList<Item> items){
        this.item = items;
    }

