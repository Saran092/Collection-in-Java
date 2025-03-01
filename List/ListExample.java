import java.util.*;
public class ListExample {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any Name you want : ");
        String str = Sc.nextLine();
        List <String> list = new ArrayList<>();
        
        list.add("Saran");
        list.add("Thomas");
        list.add("Shelby");
        list.add("John");
        list.add(str); // 👈 Add Element in List By User
        list.add(3,"Java"); // 👈 Adds element at a specific index

        System.out.println("First Element : "+ list.get(0)); // 👈 Returns element at the given index

        for(String ele : list)
        {
            System.out.println(ele);
        }
        System.out.println(" -------------------------------- ");
        
        list.remove(str); // 👈 Removes first occurrence of given element

        for(String ele : list)
        {
            System.out.println(ele);
        }
        System.out.println(" -------------------------------- ");

        list.remove(3); // 👈 Removes element at the specified index 

        for(String ele : list)
        {
            System.out.println(ele);
        }
        System.out.println(" -------------------------------- ");

        list.set(2,"Sam"); // 👈 Replaces the element at the given index

        for(String ele : list)
        {
            System.out.println(ele);
        }
        System.out.println(" -------------------------------- ");

        int sizeOfList = list.size(); // 👈 Returns the number of elements in the list
        System.out.println("Size of your List : " + sizeOfList);

        boolean isIt = list.contains("Saran");
        System.out.println("Status of Contains : " + isIt); // 👈 Checks if the list contains the element

        System.out.println(" ❌--------------------------------❌");

        List <Integer> number = new ArrayList<>();

        number.add(10);
        number.add(30);
        number.add(40);
        number.add(20);

        Collections.sort(number); // 👈 Sorts in ascending order
        System.out.println(number);

        System.out.println(" ❌--------------------------------❌");

        String arr[] = list.toArray(new String [0]); // 👈 ArrayList Convert to array
        for(String elm : arr)
        {
            System.out.println(elm);
        }
        Sc.close();
    }
}
