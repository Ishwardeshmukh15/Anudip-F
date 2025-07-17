import java.util.Scanner;

public class GSTCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Original Price: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter GST Rate (%): ");
        double gstRate = sc.nextDouble();

        double gstAmount = (originalPrice * gstRate) / 100;
        double totalPrice = originalPrice + gstAmount;

        System.out.println("GST Amount: " + gstAmount);
        System.out.println("Total Price including GST: " + totalPrice);
        sc.close();
    }
}
