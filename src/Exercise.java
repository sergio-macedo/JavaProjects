import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double A;
        double B;
        double C;
        double pi = 3.14159;
        A= sc.nextDouble();
        B= sc.nextDouble();
        C= sc.nextDouble();
        double triangleArea;
        double circleArea;
        double trapezioArea;
        double squareArea;
        double rectangleArea;

        triangleArea = (A*C)/2;
        circleArea = pi* Math.pow(C,2);
        trapezioArea = ((A+B)*C)/2;
        squareArea = Math.pow(B,2);
        rectangleArea = A*B;

        System.out.printf("%.3f%n",triangleArea);
        System.out.printf("%.3f%n",circleArea);
        System.out.printf("%.3f%n",trapezioArea);
        System.out.printf("%.3f%n",squareArea);
        System.out.printf("%.3f%n",rectangleArea);


    }

}
