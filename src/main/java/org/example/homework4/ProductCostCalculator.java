package org.example.homework4;

public class ProductCostCalculator {
    public static void main(String[] args) {
        double unitPrice = 10.0;
        int quantity = 100;

        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);
    }

    private static double calculateTotalCost(double unitPrice, int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            return 0.0;
        } else if (quantity > 10 && quantity <= 20) {
            return quantity * unitPrice * 0.95;
        } else if (quantity > 20 && quantity <= 30) {
            return quantity * unitPrice * 0.90;
        } else if (quantity > 20 && quantity <= 30) {
            return quantity * unitPrice * 0.1;
        } else if (quantity > 30 && quantity <= 80) {
            return quantity * unitPrice * (1 - (0.12 + ((quantity - 30) / 10) * 0.004));
        } else if (quantity > 80) {
            return quantity * unitPrice * 0.87;
        } else {
            return quantity * unitPrice;
        }
    }
}