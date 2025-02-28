import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any Name you want : ");
        String str = Sc.nextLine();
        Set <String> list = new HashSet<>();
        
        list.add("Saran");
        list.add("Thomas");
        list.add("Shelby");
        list.add("John");
        list.add("Saran");
        list.add(str); // 👈 Add Element in List

        // System.out.println("First Element : "+ list.get(0)); // We can't use get 

        for(String ele : list)
        {
            System.out.println(ele);
        }

        list.remove(str); // 👈 Remove Element in List

        Sc.close();
    }
}
