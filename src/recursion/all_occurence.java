package recursion;
import java.util.*;
public class all_occurence {
    public static int[] searcher(int currenIndex,int storer,int[] arr,int[] store)
    {
        if(currenIndex==arr.length)
            return store;
        if(arr[currenIndex]==7)
        {
            store[storer]=currenIndex;
            return searcher(currenIndex+1,storer+1,arr,store);
        }
        else
            return searcher(currenIndex+1,storer,arr,store);
    }
    public static void main(String[] args) {
        int arr[]={1,7,4,7,6};
        int count=0;
        for(var i:arr)
        {
            if(i==7)
                count=count+1;
        }
        int store[]=new int[count];
        int[] printer = searcher(0,0,arr,store);
        for(var i:printer)
            System.out.print(i+" ");
    }
}
