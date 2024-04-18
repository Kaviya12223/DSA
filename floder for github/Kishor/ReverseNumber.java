import java.util.Scanner;

public class ReverseNumber {
    static int n;
    public static void reverse(int n){
        if(n < 10){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n % 10);
            reverse(n/10);

        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter : ");
        int num = sc.nextInt();
        reverse(num);
        if(n==num){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
