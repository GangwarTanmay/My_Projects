import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        int n,d;
        int s = 0;
        int p = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        n = sc.nextInt();
        while(n>0){
            d = n%10;
            n = n/10;
            s = s+d;
            p = p*d;
        }
        if(s == p){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }
    }
}
