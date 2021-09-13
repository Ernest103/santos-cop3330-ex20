package org.example;

import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String state, county;
        double charge, tax = 0;

        System.out.print("What is your order amount? ");
        charge = sc.nextDouble();

        System.out.print("What state do you live in? ");
        state = sc.next();

        switch (state.toLowerCase())
        {
            case "wisconsin":
                tax = 0.05;
                System.out.print("What county do you live in? ");
                county = sc.next();
                if(county.equalsIgnoreCase("eau claire"))
                    tax += 0.005;
                if(county.equalsIgnoreCase("dunn"))
                    tax += 0.004;
                break;
            case "illinois":
                tax = 0.08;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + state.toLowerCase());
        }
        tax = charge * tax;
        charge += tax;

        System.out.printf("The tax is: $%.2f\n" +
                "The total is: $%.2f", tax, charge);
    }
}
