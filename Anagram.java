import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string : ");
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
         if(s1.length()!=s2.length()){
             System.out.println("Enter valid strings !!!!");
         }
         else{
             char ch,ch2;
             int count1 , count2 ;
             for(int i=0 ; i<s1.length() ; i++){
                 ch = s1.charAt(i);
                 ch2 = s2.charAt(i);
                 count1 = 0;
                 count2 = 0;
                 for(int j = 0 ; j<s1.length() ; j++){
                     if(s1.charAt(j)==ch){
                         count1++;
                     }
                 }
                 for(int k = 0 ; k<s1.length() ; k++){
                     if(s2.charAt(k)==ch2){
                         count2++;
                     }
                 }
                 if(count1 == count2){
                     System.out.println("Yes");
                 }
                 else{
                     System.out.println("No");
                 }
             }
         }
    }
}
