

public class TestOrder{

    public static void main(String[] args){


        Item item1 = new Item("mocha", 1.95);
        Item item2 = new Item("latte", 1.50);
        Item item3 = new Item("drip coffee", 0.75);
        Item item4 = new Item("capuccino", 4.75);


        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item2);

        Order order2 = new Order();
        order2.addItem(item2);
        order2.addItem(item3);

        Order order3 = new Order("Brian");
        order3.addItem(item3);
        order3.addItem(item4);

        Order order4 = new Order("Marsha");
        order4.addItem(item4);
        order4.addItem(item1);

        Order order5 = new Order("Paul");
        order5.addItem(item1);
        order5.addItem(item2);

        System.out.printf("%s", order4.getOrderName());
        System.out.printf("%s", order5.getOrderItems().get(0));
        System.out.printf("%s", order4.getOrderItems().get(1));
    }
}