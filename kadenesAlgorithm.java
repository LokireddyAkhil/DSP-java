import java.util.Scanner;
import java.util.*;
public class kadenesAlgorithm {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter rows");
            int r = sc.nextInt();
//        System.out.print("enter columns");
//        int c = sc.nextInt();
            int arr[]= new int[r];
            System.out.println("enter elements");
            for (int i = 0; i < r; i++) {
                arr[i]=sc.nextInt();
            }
            printarray(arr);
            int a = maxSubSum(arr);
            System.out.println(a);
// check the method from striver also how to return an subarray.
        }
        public static void printarray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static int  maxSubSum(int arr[]){

            int maxsum =Integer.MIN_VALUE;

            for (int i = 0; i < arr.length ; i++) {
                int sum = arr[i];
                for (int j = i+1; j <arr.length ; j++) {
                    sum +=arr[j];
                    if(sum > maxsum){
                        maxsum=sum;
                    }
                }
            }
            return maxsum;

        }
}
