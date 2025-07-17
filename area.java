import java.util.Scanner;

public class area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Radius: ");
        double r = sc.nextDouble();
        double pi = 3.141592653589793;

        double result = pi * r * r;

        System.out.println("Area of the circle is: " + result);

        sc.close();
    }
}
