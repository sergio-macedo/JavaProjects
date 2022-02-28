import java.util.Scanner;

public class Conditionals {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        System.out.println("what is the salary?");

        if (salary > 2000.01 && salary <= 3000) {
            double taxa;
            taxa = (salary - 2000.01) * 0.08;
            System.out.println(taxa);
        } else if (salary > 3000.01 && salary <= 4500.00) {
            double taxa;
            taxa = (salary - 3000.01) * 0.18 + (3000.00 - 2000.01) * 0.08;
            System.out.println(taxa);
        } else if (salary > 4500) {
            double taxa;
            taxa = (salary - 4500.00) * 0.28 + (4500.00 - 3000.01) * 0.18 + (3000.00 - 2000.01) * 0.08;
            System.out.println(taxa);
        } else {
            System.out.println("you don't need to pay taxes");
        }
        sc.close();
    }


}
