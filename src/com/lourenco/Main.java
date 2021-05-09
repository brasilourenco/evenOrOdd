package com.lourenco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextByte();

            if (input % 2 == 0) {
                System.out.println("Odd");
            } else {
                System.out.println("Even");
        }
    }
}