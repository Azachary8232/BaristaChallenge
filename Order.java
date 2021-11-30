import java.util.ArrayList;


class Order{

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