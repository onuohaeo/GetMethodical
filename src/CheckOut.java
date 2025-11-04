import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        boolean keepShopping = true;
        double totalPrice = 0;

        while (keepShopping) {
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of item (max $10.00): ", 0, 10);
            totalPrice += itemPrice;  // Add the price to the total

            keepShopping = SafeInput.getYNConfirm(in, "Do you have more items? (Y/N): ");
        }

        System.out.printf("Your cart total is $%.2f%n", totalPrice);
    }
}