import java.util.Arrays;
import java.util.Scanner;

public class QuickselectAlgo {
    // time complexity = O(nlogk)
    static int k ;
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int a = sc.nextInt();
        System.out.println("enter array elemnts");
        int arr[]= new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k");
        k = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        QSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);


    }
    public static int  partition(int arr[],int low,int high){
        int mid = (low+high)/2;
        int pivot = arr[mid];
        int sc=0;
        int PivotIndex = mid;
        for(int i=low;i<=high;i++){
            if(i==mid) continue;
            if(arr[i]<pivot) sc++;
        }
        int ci = low+sc;
        swap(arr,PivotIndex,ci);
        int i=low;
        int j=high;
        while(i<ci && j>ci){
            if(arr[i]<pivot) i++;
            else if (arr[j]>pivot)  j--;
            else if ( arr[i]>pivot && arr[j]<pivot) swap(arr,i,j);
        }
        return ci;
    }
    public static void swap( int arr[], int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void QSort(int arr[],int low,int high){
        if(low>high)  return;
        if(low==high){
            if(low==k-1) ans= arr[low];
        }
        int pivotIndex = partition(arr, low, high);
        if(pivotIndex == k-1) {
           ans = arr[pivotIndex];
            return;
        } else if (pivotIndex < k-1) {
            QSort(arr, pivotIndex + 1, high);
        }
        else {
            QSort(arr, low, pivotIndex - 1);
        }


    }

}
