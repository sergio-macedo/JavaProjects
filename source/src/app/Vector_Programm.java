package app;

import entities.Product;
import entities.Rent_Room;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Vector_Programm {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Type the ammount of products");
        int n = sc.nextInt();
        Product[] vector = new Product[n];
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            System.out.println("Type the name of the products");
            String name = sc.nextLine();
            System.out.println("Type the price of the products");
            double price = sc.nextDouble();
            vector[i] = new Product(name, price);
            sum += vector[i].getPrice()/ vector.length;
        }
        System.out.println("The average price is: " + sum);

    */
        Rent_Room[] rent = new Rent_Room[10];
        System.out.println("How many rooms will be rented");
        int amountRooms = sc.nextInt();

        for (int i = 1; i <= amountRooms; i++) {
            sc.nextLine();
            System.out.println();
            System.out.println("Type the name of the rooomate");
            String name = sc.nextLine();
            System.out.println("Type the email");
            String email = sc.nextLine();
            System.out.println("Type the room that the guest is taking");
            int rooms = sc.nextInt();
            rent[rooms] = new Rent_Room(name, email);

        }

        System.out.println();
        System.out.println("Busy rooms");
        for (int i = 0; i < 10; i++) {
            if (rent[i] != null) {
                int j = 1;
                System.out.println( "Rent #:" + j + "Name" + rent[i].getName());
                System.out.println("Email:" + rent[i].getEmail());
                System.out.println( "Room:" + i);
                j++;
            }
        }
        sc.close();
    }
}
