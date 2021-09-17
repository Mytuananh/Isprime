package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println(num + " is Not Prime");
        }
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " is Prime");
            }
            else {
                System.out.println(num + " is Not Prime");
            }
        }
    }

}
