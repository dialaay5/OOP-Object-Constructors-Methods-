package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1:");
        System.out.println("ביצירת המופע היה צריך להשתמש במילת new");

        System.out.println("Question 2:");
        System.out.println("Rectangle myRec = new Rectangle(width, height)");


        System.out.println("Question 3: ");
        NumberHolder obj1 = new NumberHolder();
        NumberHolder obj2 = new NumberHolder(2);
        System.out.println(obj2);
        System.out.println(obj1);

        System.out.println("Question 4:");
        Student student1 = new Student("sam",5, "0502655651", "haifa");
        Student student2 = new Student("john",2, "0524633576", "tel-aviv");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("Question 5:");
        Rectangle rectangle = new Rectangle(5.0,4.0);
        System.out.println(rectangle.getArea());

        System.out.println("Question 6:");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int number_a = s.nextInt();
        Average.setA(number_a);
        System.out.println("Please enter second number:");
        int number_b = s.nextInt();
        Average.setB(number_b);
        System.out.println("Please enter third number:");
        int number_c = s.nextInt();
        Average.setC(number_c);
        Average.calculate();

        System.out.println("\nQuestion 7:");
        Employee employee1 = new Employee("robert", 1994, "64c_wallsStreet", 10000);
        Employee employee2 = new Employee("sam", 2000, "68d_wallsStreet", 20000);
        Employee employee3 = new Employee("john", 1999, "26b_wallsStreet", 30000);
        System.out.println("name    year    address      salary");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}