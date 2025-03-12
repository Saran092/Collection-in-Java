import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        names.add("Saran");
        names.add("Emma");
        names.add("John");
        names.add("Saran"); // 👈 Duplicate, ignored

        System.out.println(names); // 👈 Unordered Output


        Sc.close();
    }
}
