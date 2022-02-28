import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String1[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2 ,s3;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();


        System.out.println("voce digitou:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();


        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.println("Products");
        System.out.printf("Computer, which price is $ %f %n", price1);
        System.out.printf("Office desk, which price is $ %f%n", price2);
        System.out.printf("Record: %d years old, code %d and gender : %s %n", age,code,gender);

        System.out.printf("Measure with eight decimal places: %f",measure);
        System.out.printf("Rounded (three decimal places): %.3f%n",measure);

        System.out.printf("Rounded (three decimal places): %.3f%n",measure);



    }
}
