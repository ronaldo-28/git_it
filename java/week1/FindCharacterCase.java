
// ctrl F5 to run code
import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("1");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        } else {
            System.out.println("-1");
        }
    }
}
