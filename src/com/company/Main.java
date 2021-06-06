/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = user_input.next();
        System.out.println("Hello " + name + ", Nice to meet you!");
    }
}
