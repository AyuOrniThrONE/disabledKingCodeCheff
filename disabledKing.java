import java.util.Scanner;

public class disabledKing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        if (1<=t && t<=500) {
            for (int i = 0; i < t; i++) {
                int n= sc.nextInt();
                if (n%2==0) {
                    System.out.println(n);
                }else{
                    System.out.println(n-1);
                }
            }
        }
    }
}
