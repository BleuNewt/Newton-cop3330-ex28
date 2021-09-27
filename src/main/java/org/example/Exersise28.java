package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Newton
 */
import java.util.Scanner;
public class Exersise28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tot = 0;

        for (int a = 0; a < 5; a++)
        {
            System.out.print("Enter a number: ");
            tot += scan.nextInt();
        }

        System.out.println("The total is " + tot + ".");
    }
}