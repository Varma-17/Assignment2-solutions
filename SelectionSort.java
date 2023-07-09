import java.util.Scanner;

public class SelectionSort
{
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
        //Selection Sort
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
