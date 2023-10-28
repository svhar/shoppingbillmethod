package coo.task4;

import java.util.Scanner;

public class Shoppingbill {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        System.out.println();
        double[] prices = new double[n];
        String[] items = new String[n];
        for (int i = 0; i < n; i++) {
          System.out.print("Enter the name of the item " + (i + 1) + ": ");
          items[i] = scanner.next();
          System.out.print("Enter the price of the item " + (i + 1) + ": ");
          prices[i] = scanner.nextDouble();
        }
        System.out.println();
        System.out.println("Your shopping bill:");
        for (int i = 0; i < n; i++) {
          System.out.println(items[i] + " " + prices[i]);
        }
        System.out.println();
        System.out.print("Enter the discount: ");
        double discount = scanner.nextDouble();
        System.out.print("Enter the tax: ");
        double tax = scanner.nextDouble();
        double total = 0;
        for (int i = 0; i < n; i++) {
          total += prices[i];
        }
        total = total * (1 - discount / 100);
        total = total + (tax / 100 * total);
        System.out.println("Your total bill is: " + total);
    }
  }
}

