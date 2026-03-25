package week1.snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckoutApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckoutApp app = new CheckoutApp();

        List<String> items = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();
        List<Double> prices = new ArrayList<>();

        System.out.println("What is the customer's Name");
        String customerName = scanner.nextLine();

        String addMore = "yes";
        while (addMore.equalsIgnoreCase("yes")) {
            System.out.println("What did the user buy?");
            items.add(scanner.next());

            System.out.println("How many pieces?");
            quantities.add(scanner.nextInt());

            System.out.println("How much per unit?");
            prices.add(scanner.nextDouble());

            System.out.println("Add more Items?");
            addMore = scanner.next();
        }

        System.out.println("What is your name?");
        String cashierName = scanner.next();
        System.out.println("How much discount will he get");
        double discountPercentage = scanner.nextDouble();

        double subTotal = app.calculateSubTotal(quantities, prices);
        double discount = app.calculateDiscount(subTotal, discountPercentage);
        double tax = app.calculateValueAddedTax(subTotal);
        double billTotal = app.calculateBillTotal(subTotal, discount, tax);

        app.printInvoice(customerName, cashierName, items, quantities, prices, subTotal, discount, tax, billTotal, false);

        System.out.println("How much did the customer give to you?");
        double amountPaid = scanner.nextDouble();
        double balance = app.calculateBalance(billTotal, amountPaid);

        app.printInvoice(customerName, cashierName, items, quantities, prices, subTotal, discount, tax, billTotal, true);
        System.out.printf("      Amount Paid:  %.2f%n", amountPaid);
        System.out.printf("          Balance:  %.2f%n", balance);
        System.out.println("=========================================");
        System.out.println("        THANK YOU FOR YOUR PATRONAGE     ");
        System.out.println("=========================================");
    }

    public double calculateSubTotal(List<Integer> quantities, List<Double> prices) {
        double total = 0;
        for (int i = 0; i < quantities.size(); i++) {
            total += (quantities.get(i) * prices.get(i));
        }
        return total;
    }

    public double calculateDiscount(double subTotal, double percentage) {
        return subTotal * (percentage / 100);
    }

    public double calculateValueAddedTax(double subTotal) {
        return subTotal * 0.075;
    }

    public double calculateBillTotal(double subTotal, double discount, double tax) {
        return (subTotal - discount) + tax;
    }

    public double calculateBalance(double billTotal, double amountPaid) {
        return amountPaid - billTotal;
    }

    private void printInvoice(String customer, String cashier, List<String> items, List<Integer> quantities, List<Double> prices, double sub, double disc, double tax, double total, boolean isFinal) {
        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy h:mm:ss a")));
        System.out.println("Cashier: " + cashier);
        System.out.println("Customer Name: " + customer);
        System.out.println("=========================================");
        System.out.printf("%15s %5s %8s %10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < items.size(); i++) {
            double itemTotal = quantities.get(i) * prices.get(i);
            System.out.printf("%15s %5d %8.2f %10.2f%n", items.get(i), quantities.get(i), prices.get(i), itemTotal);
        }

        System.out.println("-----------------------------------------");
        System.out.printf("            Sub Total:  %.2f%n", sub);
        System.out.printf("             Discount:  %.2f%n", disc);
        System.out.printf("           VAT @ 7.5%%:  %.2f%n", tax);
        System.out.println("=========================================");
        System.out.printf("           Bill Total:  %.2f%n", total);

        if (!isFinal) {
            System.out.println("=========================================");
            System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + total);
            System.out.println("=========================================");
        }
    }
}