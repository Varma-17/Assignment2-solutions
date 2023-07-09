import java.util.*;

public class ArrayDuplicates {
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
        HashMap<Integer,Integer> map = new HashMap<>();
        int flag=0;
        for (int i : arr) {
            if(map.containsKey(i))
            {
                flag=1;
                break;
            }
            else
            {
                map.put(i,0);
            }
        }
        System.out.println();
        if(flag==0)
        {
            System.out.print("No duplicates");
        }
        else
        {
            System.out.print("Array contains duplicates");
        }
    }
}
