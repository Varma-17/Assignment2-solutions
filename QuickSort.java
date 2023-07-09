import java.util.Scanner;

public class QuickSort
{
    public static int partition(int arr[],int start, int end)
    {
        int pIndex=start;
        int pivot = arr[end];
        for (int i = start; i < end; i++) {
            if(arr[i]<pivot)
            {
                //swapping
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = arr[end];
        arr[end] = arr[pIndex];
        arr[pIndex] = temp;
        return pIndex;
    }
    public static void sort(int arr[],int start, int end)
    {
        if(start<end)
        {
            int pIndex = partition(arr, start, end);
            sort(arr,start,pIndex-1);
            sort(arr,pIndex+1,end);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of the array :");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Quick Sort
        sort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
