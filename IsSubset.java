import java.util.*;

public class IsSubset
{
    public static boolean isSubset(int arr[],int arr2[],int n,int m)
    {
        // using hashing
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
        }
        for (int i = 0; i < m; i++) {
            if(set.contains(arr2[i]))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // array 1
        System.out.print("Enter size of the array1 :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of the array1 :");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array1 Elements");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        // array 2
        System.out.print("Enter size of the array2 :");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.print("Enter elements of the array2 :");
        for(int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array2 Elements");
        for (int i : arr2) {
            System.out.print(i+" ");
        }
        System.out.println();
        if(isSubset(arr,arr2,n,m))
        {
            System.out.println("Yes array is subset of another array");
        }
        else
        {
            System.out.println("No array is not subset of another array");
        }
    }
}
