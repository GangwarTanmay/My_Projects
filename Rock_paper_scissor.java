import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissor {
    public static void main(String[] args) {
    int com, n;
    int user_points = 0;
    int computer_points = 0;
    String user, computer="";
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();

    System.out.println("How many turns you want ? ");
    n = sc.nextInt();
    sc.nextLine();
    while(n!=0){
        com = ran.nextInt(2);
        System.out.println("\nEnter your choice.");
        user = sc.nextLine();
        if(com == 0){
            computer = "Rock";
        }
        else if(com == 1){
            computer = "Paper";
        }
        else if(com == 2){
            computer = "Scissor";
        }
        if(computer.equalsIgnoreCase("Rock") && user.equalsIgnoreCase("Paper")){
            user_points = user_points+1;
        }
        else if(computer.equalsIgnoreCase("Rock") && user.equalsIgnoreCase("Scissor")){
            computer_points = computer_points+1;
        }
        else if(computer.equalsIgnoreCase("Paper") && user.equalsIgnoreCase("Scissor")){
            user_points = user_points+1;
        }
        else if(computer.equalsIgnoreCase("Paper") && user.equalsIgnoreCase("Rock")){
            computer_points = computer_points+1;
        }
        else if(computer.equalsIgnoreCase("Scissor") && user.equalsIgnoreCase("Rock")){
            user_points = user_points+1;
        }
        else if(computer.equalsIgnoreCase("Scissor") && user.equalsIgnoreCase("Paper")){
            computer_points = computer_points+1;
        }
        else{
            user_points = user_points+1;
            computer_points = computer_points+1;
        }
        System.out.println("Computer : "+computer);
        System.out.println("You : "+user);
        n = n-1;
    }
    if(user_points > computer_points){
        System.out.println("\nYou won.");
    }
    else if(user_points < computer_points){
        System.out.println("\nYou lost.");
    }
    else{
        System.out.println("\nMatch draw");
    }
    }
}
