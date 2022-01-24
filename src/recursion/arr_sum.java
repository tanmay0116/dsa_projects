package recursion;
import java.util.*;
public class arr_sum {

    public static int calculator(int n,int arr[])
    {
        if(n==1)
            return arr[n-1];
        return arr[n-1]+calculator(n-1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int ans=calculator(arr.length,arr);
        System.out.println(ans);
    }
}
