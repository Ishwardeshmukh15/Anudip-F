import java.util.Scanner;

public class largestnum{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Enter a number: ");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println("A number is largest: " + a);
        }
            else if (b>a){
                System.out.println("A number is largest: " +b);
            } else {
                System.out.println("Same");
            }
            sc.close();

        }
    }

    