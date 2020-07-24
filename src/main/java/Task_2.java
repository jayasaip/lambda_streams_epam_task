import java.util.*;
import java.util.stream.Collectors;

public class Task_2
{
	static List<String> answerRequired(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
    public static void main(String args[]) 
    {
        List<String> list = new ArrayList<String>();
        list.add("ab1");
        list.add("abc");
        list.add("abcd");
        list.add("bcd");
        list.add("badc");
        list.add("adda");
        System.out.println("Original List:");
        for(String i:list)
            System.out.println(i);
        list=answerRequired(list);
        System.out.println("\nRequired List:");
        for(String i:list)
            System.out.println(i);
    } 
}