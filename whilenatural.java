import java.util.Scanner;

public class whilenatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        int i= 1;
        int sum = 0;
        while(i<=n)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum of the "+ n  + "natural num " + sum);
    }
}
