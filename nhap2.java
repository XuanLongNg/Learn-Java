import java.util.*;

class Currency {
    private String currency;
    private double amount;

    public Currency() {
        amount = 0;
    }

    public Currency(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}

class Customer {
    private String id;
    private String name;
    private String address;

    public Customer() {

    }

    public Customer(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nAddress: " + address + "\n";
    }
}

class OrderLine {
    private String name;
    private Currency value;

    public OrderLine() {
    }

    public OrderLine(String name, Currency value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Currency getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Currency value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Name of Order line: " + name + ". Price: " + value + "\n";
    }
}

class Order {
    private Customer customer;
    private final ArrayList<OrderLine> orderLine;
    private Currency total;

    public Order() {
        orderLine = new ArrayList<OrderLine>();
    }

    public Order(Customer customer) {
        this.customer = customer;
        orderLine = new ArrayList<OrderLine>();
        total = new Currency("NULL", 0);
    }

    public void addLine(OrderLine tmp) {
        total.setCurrency(tmp.getValue().getCurrency());
        total.setAmount(tmp.getValue().getAmount() + total.getAmount());
        orderLine.add(tmp);
    }

    public void removeLine(OrderLine tmp) {
        orderLine.remove(orderLine.indexOf(tmp));
    }

    @Override
    public String toString() {
        String ans = "";
        for (OrderLine line : orderLine) {
            ans += line;
        }
        return "Your bill:\n" + customer + ans + "Total: " + total + "\n";
    }
}

class OrderIterator {
    private int index;

    public OrderIterator() {

    }

    public OrderIterator(int index) {
        this.index = index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

class OrderList {
    private ArrayList<Order> orderList;

    public OrderList() {

    }

    public OrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public void add(Order order) {
        orderList.add(order);
    }

    
    public void remove(Order tmp) {
        orderList.remove(orderList.indexOf(tmp));
    }
    public int getCount() {
        return 0;
    }
    
    public OrderIterator getIterator(Order tmp) {
        OrderIterator ans = new OrderIterator();
        ans.setIndex(orderList.indexOf(tmp));
        return ans;
    }
}

public class nhap2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameCus, addCus, idCus;
        System.out.println("Please enter Customer ID: ");
        idCus = input.nextLine();
        System.out.println();
        System.out.print("Please enter Customer Name: ");
        nameCus = input.nextLine();
        System.out.println();
        System.out.println("Please enter Customer Address: ");
        addCus = input.nextLine();
        System.out.println();
        Customer customer = new Customer(idCus, nameCus, addCus);

        System.out.println("Please enter order quantity: ");
        int quantity = Integer.valueOf(input.nextLine());
        System.out.println();
        Order new_order = new Order(customer);

        for (int i = 0; i < quantity; i++) {
            System.out.println("Please enter the currency you want to pay: ");
            String currency = input.nextLine();
            System.out.println();
            System.out.println("Please enter the Name order line: ");
            String nameOrder = input.nextLine();
            System.out.println();
            System.out.println("Enter the price of order line: ");
            double amount = Double.valueOf(input.nextLine());
            System.out.println();
            OrderLine tmp = new OrderLine(nameOrder, new Currency(currency, amount));
            new_order.addLine(tmp);
        }

        System.out.println(new_order);
    }
}