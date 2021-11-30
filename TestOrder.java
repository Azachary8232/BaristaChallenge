

public class TestOrder{

    public static void main(String[] args){

        Order order1 = new Order();
        Order order2 = new Order();
        
        Order order3 = new Order("Brian");
        Order order4 = new Order("Marsha");
        Order order5 = new Order("Paul");
        
        System.out.printf("%s", order4.getOrderName());

    }
}