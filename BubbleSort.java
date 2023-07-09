import java.util.Scanner;

public class BubbleSort
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
        //bubble sort
        for(int i=0;i<n-1;i++)
        {
            int flag=0;
            for (int j = 0; j < n-i-1; j++) { 
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}Bubble
