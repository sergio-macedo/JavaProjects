package application;

import entities.*;
import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // In this programm I have three diferent kinds of OOP and four diferent Classes attachted to this main
        // Starts with the class Product
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("price ");
        double price = sc.nextDouble();
        Product product = new Product();

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price " + product.getPrice());
        product.setQuantity(12);
        System.out.println("Updated quantity "+ product.getQuantity());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data " + product);
        System.out.println("Enter the number of products to be removed from stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data " + product);
    
        //Now is the class Rectangle
        System.out.println("type the width and the height of the rectangle");
        Rectangle rectangle = new Rectangle();
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();
        System.out.println(" rectangle area: " + rectangle.area() + " rectangle perimeter: " + rectangle.perimeter() + " rectangle diagonal: " + rectangle.diagonal());
        //The class employee
        System.out.println("type the name of the employee, the gross salary and the tax that he/she has to pay ");
        Employee employee = new Employee();
        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();
        System.out.println("The employee's name is " + employee.name + "The salary is " + employee.netSalary());
        System.out.println("Which percentage do you want to increase the gross salary");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("The name and the increased salary are " + employee.name + ", " + employee.netSalary());
        //The class Student
        Student student = new Student();
        System.out.println("Type the name of the student and his/hers grades");
        student.studentName = sc.nextLine();
        student.firstTrimester = sc.nextDouble();
        student.secondTrimester = sc.nextDouble();
        student.thirdTrimester = sc.nextDouble();

        System.out.println(student.finalGrade());
        //The Currency converter to test the static members


        System.out.println("Type the ammount that you are planning to buy");
        double ammountOfDollars = sc.nextDouble();
        double totalOfReais = CurrencyConverter.converter(ammountOfDollars);
        System.out.println(totalOfReais);


        //BankAccount
        BankAccount bankAccount;
        System.out.println("Enter account number");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account holder");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there a initial deposit?");
        char question = sc.next().charAt(0);
        if (question == 'y') {
            System.out.println("Enter the initial deposit");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(accountNumber, holder, initialDeposit);
        } else {
            bankAccount = new BankAccount(accountNumber, holder);
        }
        System.out.println();
        System.out.println("Account data");
        System.out.println(bankAccount);

        System.out.println();
        System.out.println("Enter a deposit value");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.println(bankAccount);

        System.out.println("Enter a withdraw value");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println(bankAccount);

        sc.close();
    }
}
