import java.util.Scanner;
public class linearsearch{
    public static int linear(int arr[],int key){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        System.out.println("Enetr your key : ");
        int key = sc.nextInt();
        int index = linear(arr,key);
        if(index == -1){
            System.err.println("Invalid key");
        }else{
            System.err.println("the value is in "+index);
        }
        System.err.println(index);
    }
}