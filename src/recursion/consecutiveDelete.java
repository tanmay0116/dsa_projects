package recursion;
import java.util.*;
public class consecutiveDelete {
    public static StringBuilder deleter(int currentIndex, StringBuilder s)
    {
        if(currentIndex+1==s.length())
            return s;
        if(s.charAt(currentIndex)==s.charAt(currentIndex+1))
        {
            s.deleteCharAt(currentIndex+1);
            return deleter(currentIndex,s);
        }
        else
        {
          return deleter(currentIndex+1,s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the string : ");
        s=sc.next();
        StringBuilder build = new StringBuilder(s);
        StringBuilder ans= deleter(0,build);
        System.out.println("Final string :"+ans);
    }
}
