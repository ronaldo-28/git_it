import java.util.Scanner;
public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        while(i <= n){
            int j = 1;
            char p =  (char) ('A' + n - i);
            while(j <= i){
                System.out.print(p);
                j++;
                p++;
            }
            i++;
            System.out.println();
        }
    }
}
