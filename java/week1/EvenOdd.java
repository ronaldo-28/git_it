import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        sc.close();
//        int rem = a % 2;
//        boolean result = rem == 0;
        if(a % 2 == 0){
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a + " is odd");
        }

    }
}
