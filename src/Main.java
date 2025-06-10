public class Main {
    public static void main(String[] args) {

        //Variables
        double purchasePrice = 270;
        double taxRate = 0.05;
        double salesTax = purchasePrice * taxRate;
        double totalPrice = salesTax + purchasePrice;

        // Outputs
        System.out.println("The purchase price is : $" + purchasePrice);
        System.out.println("The sales tax is: $" + salesTax);
        System.out.println("The total price is: $" + totalPrice);
    }
}
