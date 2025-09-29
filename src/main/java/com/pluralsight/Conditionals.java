package com.pluralsight;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        //2
        if (age >= 18) {
            System.out.println("You are and adult!");
        }
        else if (age < 18) {
            System.out.println("You are a child!");
        }
        System.out.print("Enter a grade (A-F): ");
        String grade = scanner.nextLine();

        //3
        if(grade.equals("A")){
            System.out.println("Excellent!");
        }
        else if(grade.equals("B")){
            System.out.println("Good Job!");
        }
        else if(grade.equals("C")){
            System.out.println("You Passed!");
        }
        else if(grade.equals("D")){
            System.out.println("Barely passed.");
        }
        else if(grade.equals("F")){
            System.out.println("Failed.");
        }
        //4
        String word1 = "hello";
        String word2 = new String("hello");

        System.out.println(word1 == word2);
        System.out.println(word1.equals(word2));

        //5
        System.out.print("Enter Username: ");
        String name = scanner.next();

        System.out.print("Enter Password: ");
        String password = scanner.next();

        if (password.equals("1234") && name.equals("admin")){
            System.out.println("Access Granted");
        }
        else if (password.equals("letmein") || name.equals("guest")) {
            System.out.println("Access Granted");
        }
        else System.out.println("Access Denied");


    }
}
