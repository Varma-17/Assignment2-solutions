import java.util.Scanner;

public class MergeSort
{
    public static void merge(int arr[],int start,int mid,int end)
    {
        int l=mid-start+1;
        int r=end-mid;
        int L[] = new int[l];
        int R[] = new int[r];
        for (int i = 0; i < l; i++) {
            L[i] = arr[start+i];
        }
        for (int j = 0; j < r; j++) {
            R[j] = arr[mid+1+j];
        }
        int i=0,j=0,k=start;
        while(i<l && j<r)
        {
            if(L[i]<R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<l)
        {
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<r)
        {
            arr[k]=R[j];
            j++;
            k++;
        }

    }
    public static void mergeSort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
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
        //Merge Sort
        mergeSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
