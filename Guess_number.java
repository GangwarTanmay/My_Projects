import java.util.Scanner;
import java.util.Random;
class Game{
    public int number;
    public int inputNumber;
    public int count=0;
    Game(){
        Random r = new Random();
        this.number = r.nextInt(50);
    }

    int input(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter number.");
            inputNumber = sc.nextInt();
            return inputNumber;
    }

    int check(int n){
        count++;
        if(n>number){
            System.out.println("Enter lower number....");
            return 1;
        }
        else if(n<number){
            System.out.println("Enter higher number....");
            return 2;
        }
        else{
            System.out.println("You guessed it right in "+count+" attempts");
            return 0;
        }
    }
}


public class Guess_number{
    public static void main(String[] args) {
        int flag = 1;
        System.out.println("Game me aapka Swagat hai....:)");
        Game obj = new Game();
        while (flag != 0) {
            int no = obj.input();

            if(no > 50){
                System.out.println("Enter number less than 50 !!!");
            }
            else {
                flag = obj.check(no);
            }
        }
        System.out.println("Game Over.");
    }
}