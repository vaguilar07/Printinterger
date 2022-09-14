import java.util.Scanner;

public class Main {
  //capture a interger from the keyboard.
  public static void main (String[] args){
    //inpout from standar keyboard
    Scanner reader = new Scanner(System.in);
    System.out.print("enter a number:");
    
    //next declare an int variable to store the number
    float number = reader.nextInt();

    //print in a line the number we entered
    System.out.println("You entered: " +  number);
  }
}