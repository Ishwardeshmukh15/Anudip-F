

public class abcpattern{
    public static void main(String[] args){
        int n = 0; char temp ='A';
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                n++;
                System.out.print(temp);
                temp = (char)(temp + 1);

            }
            System.out.println();
            }

    }

}
