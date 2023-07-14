
import java.util.Scanner;
public class Main {

    public static int brute_force(String s, String p) {
        int lengthString = s.length();
        int lengthPattern = p.length();
        int max = lengthString - lengthPattern  ;
        for (int i = 0; i < max; i++) {
            boolean flag = true;
            for (  int j = 0; j < lengthPattern && flag ; j++) {
                if (p.charAt(j) != s.charAt(j + i)) {
                    flag = false;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the main String : ");
        String s = input1.nextLine();
        System.out.println("Enter the pattern String : ");
        String p = input1.nextLine();
        int startIndex = brute_force(s,p);
        if (startIndex == -1) {
            System.out.println("String match unsuccessful");
        } else {
            System.out.println("String match Successful and Starts at index : " + startIndex);
        }
    }
}


