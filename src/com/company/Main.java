package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WareHouse wareHouse = new WareHouse();

        System.out.print("Enter the number of employees: ");
        int length = scanner.nextInt();
        System.out.println("========");
        for (int i = 0; i < length; i++) {
            System.out.println("Product  №" + (i + 1) + ":");
            System.out.print("Amount: ");
            int amount = scanner.nextInt();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            System.out.print("Manufacturer: ");
            String manufacturer = scanner.next();
            System.out.println("========");

            wareHouse.addProduct(new Product(amount, price, year, manufacturer));
        }

        wareHouse.getDearestProduct();
    }
}
