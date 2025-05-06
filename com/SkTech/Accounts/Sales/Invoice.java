package com.sktech.accounts.sales;

public class Invoice {
    int invoiceNumber;
    String name;
    double amount;
    double payment;

    public Invoice(int i, String n, double a, double p) {
        this.invoiceNumber = i;
        this.name = n;
        this.amount = a;
        this.payment = p;
    }

    public void displayInvoice() {
        System.out.println("*** Printing Invoice Details ***");
        System.out.println();
        System.out.println("Invoice Number: " + this.invoiceNumber);
        System.out.println("Customer Name: " + this.name);
        System.out.println("Amount: " + this.amount);
        System.out.println("Payment: " + this.payment);
    }
}