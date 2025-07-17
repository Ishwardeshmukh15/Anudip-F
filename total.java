import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        int e = sc.nextInt();

        float total = a+b+c+d+e;
        float perctange = (total/250)*100;

        if(perctange<=45)
        {
            System.out.println(perctange +" F");
        }
        else if(perctange<=75)
        {
            System.out.println(perctange + "A");
        }
        else
        {
            System.out.println(perctange +"0+");
        }
        sc.close();



    }
    
}
