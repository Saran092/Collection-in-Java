import java.util.*;

public class ListLink {

    public static void main(String[] args) {

        List <String> linked = new LinkedList<>();

        // 👇 Add elements
        linked.add("Saran");
        linked.add("John");
        linked.add("Mike");
        linked.add("Java");

        linked.addFirst("Emma"); // 👈 Add Element in first
        linked.addLast("Alice"); // 👈 Add Element in Last

        for(String ele : linked)
        {
            System.out.println(ele);
        }




        // System.out.println(linked);

    }
}