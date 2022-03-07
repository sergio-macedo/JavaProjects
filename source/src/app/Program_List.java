package app;

import entities.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program_List {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Worker> worker = new ArrayList<>();
        System.out.println("How many employees will be registered?");
        int amountOfEmployees = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < amountOfEmployees; i++) {
            System.out.println();
            System.out.println("Type the id of the employee");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Type the name of the employee");
            String name = sc.nextLine();
            System.out.println("Type the salary of the employee");
            Double salary = sc.nextDouble();
            Worker worker1 = new Worker(id, name, salary);
            worker.add(worker1);
        }

        System.out.println();
        System.out.println("Enter the employee which the salary will be increased");
        int idSalary = sc.nextInt();
        sc.nextLine();
        Worker worker1 = worker.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if (worker1 == null) {
            System.out.println(" this employee does not exist!");
        }
        else {
            System.out.println("enter the percentage: ");
            double percent = sc.nextDouble();
            worker1.increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees");

        for (Worker e : worker) {
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getSalary());
        }
        sc.close();


        /*List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        System.out.println(list.subList(0,2));
        System.out.println(list.size());
        for(String name : list){
            System.out.println(name);
        }
        System.out.println("-------------------");
        List<String> result = list.stream().filter(name -> name.charAt(0) =='A').collect(Collectors.toList());
        for (String name: result) {
            System.out.println(name);
        }
        System.out.println("-------------------");
        String find = list.stream().filter(name -> name.charAt(0) == 'K').findFirst().orElse(null);
        System.out.println(find);
        */
    }

}
