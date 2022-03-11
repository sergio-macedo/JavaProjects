package course;

import entities.*;
import entities_enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ClientOrder {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter clients name");
        String clientName = sc.nextLine();
        System.out.print("Enter client email");
        String clientEmail = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());


        Client client = new Client(clientName,clientEmail,clientBirthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);
        System.out.print("How many items to this order");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter order #" + i + " item data:");
            System.out.print("Product name");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity");
            int quantity = sc.nextInt();
            Product product = new Product(productName,productPrice);
            OrderItem orderItem = new OrderItem(quantity,productPrice,product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        sc.close();

    }
}
