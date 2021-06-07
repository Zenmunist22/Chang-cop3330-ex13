package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App
{
    public static void main( String[] args )
    {
        double principal, interest, years, total , n;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        principal = sc.nextDouble();
        System.out.print("What is the rate? ");
        interest = sc.nextDouble();
        System.out.print("What is the number of years? ");
        years = sc.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        n = sc.nextDouble();
        total =  principal * Math.pow(1 + (interest/100/n), (n*years));
        total = (int) (.5 + (total * 100));
        total /= 100;
        System.out.printf("$%.2f invested at %.2f%% for %.0f years compounded %.0f times per year is $%.2f", principal, interest, years, n, total);
    }
}