public class PrimeNumber {
    static void check(int n){
        int m=0,i,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println("not a prime number.");
        }
        else{
            for(i=2;i<m;i++){
                if(n%i == 0){
                    System.out.println("not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime number");
            }
        }
    }
    public static void main(String[] args) {
        check(1);
    }
}
