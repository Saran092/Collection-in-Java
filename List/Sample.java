import java.util.*;
class Sample{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String Str = Sc.nextLine();
        for(int i=Str.length()-1;i>=0;i--)
        {
            System.out.print(Str.charAt(i));
        }
        Sc.close();
    }
}