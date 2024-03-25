public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeesSold = 100;
        int totalCostOfBeans = 15000; // tetri

        // Converting all lari expenses to tetri
        int taxInTetri = 25 * 100; // Convert lari to tetri
        int electricityInTetri = 137 * 100; // Convert lari to tetri
        int parkingInTetri = 86 * 100; // Convert lari to tetri

        // Summing all the expenses in tetri
        int otherExpenses = taxInTetri + 76 + 183 + electricityInTetri + parkingInTetri; // Water and Gas are already in tetri

        int totalExpenses = totalCostOfBeans + otherExpenses;

        double profit = calculateProfit(pricePerCoffee, numCoffeesSold, totalExpenses);
        System.out.println("Profit in Lari: " + profit/100); // Dividing by 100 to convert tetri to lari
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeesSold, int totalExpenses) {
        // Calculate total revenue in tetri
        int revenue = numCoffeesSold * pricePerCoffee;
        // Calculate profit in tetri
        int profitInTetri = revenue - totalExpenses;

        // Return profit in lari by dividing tetri by 100
        return profitInTetri / 100.0; // Dividing by 100.0 to maintain decimal value
    }
}
