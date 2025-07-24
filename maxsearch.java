import java.util.*;
public class maxsearch {
    public static int minimum(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter the elements of array:");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       int Smallnum=minimum(arr);
       System.out.println("Maximum number is :"+Smallnum);
       sc.close();
}

}
