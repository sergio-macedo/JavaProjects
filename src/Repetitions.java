import java.util.Scanner;

public class Repetitions {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int alcohol = 0;
        int gas = 0;
        int diesel = 0;
        while (x < 4) {
            if (x == 1) {
                alcohol += 1;
            } else if (x == 2) {
                gas += 1;
            } else if (x == 3) {
                diesel += 1;
            }
            x = sc.nextInt();
        }
        System.out.println("Muito obrigado alcohol:" + alcohol + "gas: " + gas + "diesel: " + diesel);




        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {

            int qua = i * i;
            int cube = i * i * i;

            System.out.println(" " + i + " " + qua + " " + cube);

        }

        System.out.print("Temperature in celsius");
        double c = sc.nextDouble();
        double f = 9 * c / 5 + 32;
        System.out.printf("Same temperature in Fahrenheit ", f);
        System.out.print("do you want to do it again (y/n)?");
        sc.close();

    }
}
