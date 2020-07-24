import java.util.*;
import java.util.stream.IntStream;

public class Task_3 
{
	static List<String> palindrome(List<String> l1)
    {
        List<String> l2=new ArrayList<String>();
           for(String i:l1)
           {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l2.add(i);}
            return l2;
    }
    public static void main(String args[])
    {
        List<String> list=new ArrayList<String>();
        list.add("ab1");
        list.add("aba");
        list.add("abc");
        list.add("abcd");
        list.add("bcdcb");
        list.add("badc");
        list.add("adda");
        System.out.println("Original List:");
        for(String i:list)
            System.out.println(i);
        list=palindrome(list);
        System.out.println("\nPalindrome List:");
        for(String i:list)
            System.out.println(i);
    }
}