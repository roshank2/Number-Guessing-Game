import java.util.Scanner;
public class Main {
    public static int randomNumber(){
        return (int)((Math.random()*100)+1);
    }
    public static void main(String[] args) {
        System.out.println("\nI have randomly chosen a number between [ 1 , 100 ]");
        System.out.println("Try to guess it.");
        Scanner scan = new Scanner(System.in);
        boolean guessed = false;
        int i=5;
        int randomNumber = randomNumber();
        do{
            System.out.print("\nYou have " + i + " guess(es) left: ");
            int num = scan.nextInt();
            if(randomNumber==num){
                guessed = true;
                break;
            }
            else if(randomNumber>num){
                System.out.println("It's greater than " + num);
            }
            else {
                System.out.println("It's smaller than " + num);
            }
            i--;

        }while (i>0);
        if(guessed){
            System.out.println("\nCongratulation, You won!");
        }
        else {
            System.out.println("\nIt's " + randomNumber);
            System.out.println("Better luck next time!");
        }
    }
}
